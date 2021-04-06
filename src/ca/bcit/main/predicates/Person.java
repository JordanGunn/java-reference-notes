package ca.bcit.main.predicates;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incrementAge() {
        this.age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    // FILTER USING A GENERIC INTERFACE DEFINED BY PROGRAMMER
    public static void processPeople(ArrayList<Person> people, CheckPerson filter) {
        for (Person p: people) {
            if (filter.shouldShow(p)) {
                System.out.println(p.toString());
            }
        }
    }

    // FILTER USING A PREDICATE AND CONSUMER
    public static void processPeople(ArrayList<Person> people, Predicate<Person> filter, Consumer<Person> c) {
        for (Person p: people) {
            if (filter.test(p)) {
                // perform a generic operation
                // consumer accepts an argument and returns nothing
                c.accept(p);
            }
    }}

    static interface CheckPerson {
        public boolean shouldShow(Person p);
    }
}

class Demo {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // CAN DECLARE A PREDICATE ON THE FLY
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("J", "G", 29));
        people.add(new Person("G", "H", 27));
        people.add(new Person("H", "J", 50));
        people.add(new Person("J", "K", 25));
        people.add(new Person("L", "P", 5));

        // PASS NEW COMPARATOR OBJECT TO COLLECTIONS
        Person.processPeople(people, new Person.CheckPerson() {
            @Override
            public boolean shouldShow(Person p) {
                return p.getAge() >= 22;
            }
        });

        // this is the predicate defined on the fly
        Person.processPeople(people, person -> person.getAge() <= 30,

                // this is the consumer defined on the fly
                // in this case we have chosen println() as our consumer
                person -> {
                    person.incrementAge();
                    System.out.println(person.toString());

            });

        // USING A LAMBDA EXPRESSION FOR THE PREDICATE AND CONSUMER
        Person.processPeople(
                people, // first argument
                person -> person.getAge() >= 22, // lambda predicate
                person -> {                         // lambda consumer
                    person.incrementAge();
                    System.out.println(person.toString());
                }
        );
    }
}

