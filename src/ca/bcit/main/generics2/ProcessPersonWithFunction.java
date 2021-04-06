package ca.bcit.main.generics2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProcessPersonWithFunction {

    public static void main(String[] args) {

    }

    public static void processPersonWithFunction (
            List<Person> roster,                // arg 1
            Predicate<Person> tester,           // arg 2
            Function<Person, String> mapper,    // arg 3
            Consumer<String> block              // arg 4
    )
    {       // beginning of code for method
            for (Person p: roster) {
                if (tester.test(p)) {
                    String data = mapper.apply(p);
                    block.accept(data);
                }
            }
    }
}

class Person {

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
}
