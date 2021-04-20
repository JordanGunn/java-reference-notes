package ca.bcit.main.optional;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;

public class OptionalsPartTwo {

    // Typical methods of handling null pointer exceptions
    // involve the following
    void sampleMethod(String sample) {
        if (sample != null) {
            System.out.println(sample.toUpperCase());
        } else {
            System.out.println("String is null");
        }
    }

    // Java optionals allow us to avoid the above by implementing functional programming
    static void sampleOptional(String sample) {
        // Optional.empty()
        // Optional.of() <-- create optional lobject from another object
        // Optional.ofNullable() <-- not sure if the object will be present or not
        Optional<Object> empty = Optional.empty(); // <--- create an optional object and set it to empty
        System.out.println(empty);
        System.out.println(empty.isPresent()); // <--- is the Optional empty or not
        System.out.println(empty.isEmpty()); // <----- is the Optional empty

        Optional<String> hello = Optional.of("hello"); // <---- create Optional string object
        String orElse = hello.orElse("world"); // <---- default value if Optional object is empty
        System.out.println(orElse); // <---- will not print because optional 'hello' is NOT empty


        // when you are not sure if the value of the Optional is nullable or not
        // you can use Optional.ofNullable
        Optional<String> hello2 = Optional.ofNullable("hello nullable");
        String orElse2 = hello2.orElse("not null");

        System.out.println(orElse2);

        // You can chain methods together
        Optional<String> hello3 = Optional.of("hello");

        // map allows us to to a transformation on the value of the optional
        // IF IT IS PRESENT (cool af)
        String orElse3 = hello3
                .map(String::toUpperCase)
                .orElse("or else part 3");

        // can also use orElseGet() to provide a supplier
        // this allows us to pass in any logic that provides a default value
        String orElse4 = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    return "nononono";
                });

        System.out.println(orElse4);

        // .or allows us to return an optional object
        Optional<String> hello5 = Optional.of("hello");
        Optional<String> orElse5 = hello5
                .map(String::toUpperCase)
                .or(() -> {
                    return Optional.of("A default value");
                });


        // .orElseThrow allows us to throw an exception if the value is not present
        // by passing a method reference of IllegalStateException::new
        // Usually useful when you know there may be a value that is null in the stream
        Optional<String> hello6 = Optional.of("hello");
        String orElse6 = hello6
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new);

        // ifPresent() allows us to pass logic to ifPresent()
        // and do something if the value is not null
        Optional<String> hello7 = Optional.ofNullable("hello");
        hello7.ifPresent(System.out::println);


        // ifPresentOrElse() allows us to pass two arguments
        // the first being what should happen if the value is present
        // the second is a supplier that will return a value if the value
        // is NOT present
        Optional<String> hello8 = Optional.ofNullable(null);
        hello8.ifPresentOrElse(System.out::println, () -> System.out.println("hello hello hello"));


        // Using an object
        Person person1 = new Person("james", "JAMES@gmail.com");
        System.out.println(person1.getName());
        String email = person1
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");
        System.out.println(email);

        // if one of the values is NULL, we can use this in the object to let users
        // know that the values may be null as this code will fail otherwise
        // as the present statement will return a nullpointerexception
        Person person2 = new Person("james", null);
        System.out.println(person2.getName());
        String email2 = person2
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");
        System.out.println(email2);

        // you can alsoo use isPresent or isEmpty to achieve the same result
        Person person3 = new Person("james", null);

        if (person3.getEmail().isPresent()) {
            String email3 = person3.getEmail().get();
            System.out.println(email3);
        } else {
            System.out.println("Email not present");
        }







    }

    public static void main(String[] args) {
        sampleOptional("hello");
    }
}


class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    //
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
