package ca.bcit.main.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<StreamPerson> people = new ArrayList<StreamPerson>();
        people.add(new StreamPerson("Aisha", Gender.FEMALE));
        people.add(new StreamPerson("Alex", Gender.MALE));
        people.add(new StreamPerson("Alice", Gender.FEMALE));

        // .map() DEMO
        people.stream()
                .map(StreamPerson::getGender) // apply a transformation
                .collect(Collectors.toSet()) // collect the results
                .forEach(System.out::println); // print the results

        // mapToInt() DEMO
        people.stream()
                .map(StreamPerson::getName) // apply a transformation
                .mapToInt(String::length) // collect the results
                .forEach(System.out::println); // print the results

        // allMatch() DEMO
        boolean containsOnlyFemales = people.stream().allMatch(person -> Gender.FEMALE.equals(person.getGender()));
        System.out.println(containsOnlyFemales);

        // anyMatch() DEMO
        boolean containsAnyFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.getGender()));
        System.out.println(containsAnyFemales);

        // noneMatch() DEMO
        boolean containsPreferNot = people.stream()
                .noneMatch(person -> Gender.PREFER_NOT_TO_SAY
                .equals(person.getGender()));
        System.out.println(containsPreferNot);

        people.stream().max(Comparator.comparing(person -> {
            return person.getName().length();
        }));

        // !!!!! can group by particular attributes of an object !!!!!
        Map<Gender, List<StreamPerson>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(StreamPerson::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });
    }

}

class StreamPerson {

    private final String name;
    private final Gender gender;

    public StreamPerson(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }


}

enum Gender {
    MALE,
    FEMALE,
    PREFER_NOT_TO_SAY
}
