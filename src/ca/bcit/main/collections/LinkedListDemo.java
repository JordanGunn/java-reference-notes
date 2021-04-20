package ca.bcit.main.collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> list1 = new LinkedList<>();

        for (String x: things) {
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "goats", "bacon", "harrypotter"};
        List<String> list2 = new LinkedList<>();

        for (String y: things2) {
            list1.add(y);
        }

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);

    }

    public static void printMe(Collection<String> list) {
        for (String b: list) {
            System.out.println(b + " ");
        }
    }

    public static void removeStuff(List<String> list, int start, int end) {

        list.subList(start, end).clear();
    }

    public static void reverseMe(List<String> list) {
        ListIterator<String> bobby = list.listIterator(list.size());
        while(bobby.hasPrevious()) {
            System.out.println(bobby.previous());
        }
    }
}
