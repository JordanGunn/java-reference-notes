package ca.bcit.main.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // declare a predicate interface object and assign it to a lambda expression
        Predicate<Person> predicate = (person) -> person.getAge() > 30;
        // assign result to Predicate().test() method
        boolean result = predicate.test(new Person("Ramesh", 29));
        System.out.println(result);

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
