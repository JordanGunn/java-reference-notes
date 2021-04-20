package ca.bcit.main.scratch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static void main(String[] args) {

    }
}

class Mammal {

    private int weight;
    private boolean hasLegs;
    private boolean hasEyes;

    Mammal(int weight, boolean hasEyes, boolean hasLegs) {
        this.weight = weight;
        this.hasEyes = hasEyes;
        this.hasLegs = hasLegs;
    }

    public void eat() {
        System.out.println("ommmm nom nom");
    }

    public void drink() {
        System.out.println("Drinking some liquid");
    }
}

class Person extends Mammal {

    boolean canRead;
    boolean canWrite;


    Person(int weight, boolean hasEyes, boolean hasLegs) {
        super(weight, hasEyes, hasLegs);
        List<String> list = List.of("Hello", "world");

    }
}

class Test {
    public void takeList(List<? extends String> list) {
//        list.add("Foo");
//        list = new ArrayList<String>();
//        list = new ArrayList<Object>();
        String s = list.get(0);
        Object o = list;
    }
}