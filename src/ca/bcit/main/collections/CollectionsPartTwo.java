package ca.bcit.main.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsPartTwo {

    // a collection is an object for holding references to other objects

    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //. add array items to list
        for (String x : things) {
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        //. add array items to list
        for (String y : moreThings) {
            list2.add(y);
        }

        System.out.println(list1.toString());
        System.out.println(list2.toString());


    }

    public static void editList(Collection<String> list1, Collection<String> list2) {
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            if (list2.contains(it.next())) {
                it.remove();
            }
        }
    }
}
