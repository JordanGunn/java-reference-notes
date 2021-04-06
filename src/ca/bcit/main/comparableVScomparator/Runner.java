package ca.bcit.main.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Two situations to use comparator over comparable
// 1.) We use a comparator when we want to pass logic in as a second
//     parameter to collections.sort().
// 2.) We want to pad our current comparable logic with more logic
//     and cant implement comparable

public class Runner {

    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        // whenever you have a simple list of primitives like "Integer" or "String"
        // you can use Collections.sort()

        // if you have created a specific class, you must use comparable.
        Collections.sort(laps);
        System.out.println(laps);

        // USE COMPARATOR WHEN YOU HAVE A CLASS THAT IS NOT IMPLEMENTING
        // AN INTERFACE
        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
              }
        };

        Collections.sort(laps, com);
        System.out.println(laps);

    }
}
