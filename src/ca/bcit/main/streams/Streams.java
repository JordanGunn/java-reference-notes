package ca.bcit.main.streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Warren Buffet", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerberg", 50));

//        List<Person> hundredClub = new ArrayList<>();

        // this is a stream
        List<Person> hundredClub = people.stream()
                .filter(person -> person.billions >= 100)
                .collect(Collectors.toList());

        // this is aanother stream to sort
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());

        // you can combine the above streams together
        List<Person> sortedFilteredClub = people.stream()
                .filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());

        hundredClub.forEach(person -> System.out.println(person.name));
    }
}

class Person {

    String name;
    int billions;

    public Person(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }
}
