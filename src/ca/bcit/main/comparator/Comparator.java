package ca.bcit.main.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator<P> {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Jordan");
        stringList.add("Random");
        stringList.add("Text");
        stringList.add("Entry");
        stringList.add("Point");
        stringList.add("Wow");

        System.out.println("Before sort: " + stringList);

        // will do a basic sort
        Collections.sort(stringList, new SortComparator());

        System.out.println("After sort: " + stringList);

        // what if we want sort alphabetically in reverse order?
        // We must create a comparator

    }
}
