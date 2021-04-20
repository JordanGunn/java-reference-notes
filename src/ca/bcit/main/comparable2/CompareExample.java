package ca.bcit.main.comparable2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompareExample {
}

// used

class Apple implements Comparable<Apple> {
    private final String variety;
    private final Color color;
    private final int weight;

    public Apple(String variety, Color color, int weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }

    // using a single characteristics
    @Override
    public int compareTo(Apple apple) {
        return Integer.compare(this.weight, apple.weight);
    }

    // using multiple characteristics
//    public int compareTo(Apple apple) {
//
//        int result = this.variety.compareTo(apple.variety);
//
//        if (result == 0) {
//            result = this.color.compareTo(apple.color);
//        }
//
//        if (result == 0) {
//            result = Integer.compare(this.weight, apple.weight);
//        }
//
//        return result;
//    }


    public static void main(String[] args) {
        ArrayList<Apple> a = new ArrayList<>();
        a.add(new Apple("a", Color.BROWN, 4));
        a.add(new Apple("b", Color.RED, 3));
        a.add(new Apple("c", Color.YELLOW, 2));
        a.add(new Apple("d", Color.GREEN, 1));

        a.forEach(apple -> System.out.println(apple.toString()));
        Collections.sort(a);

        System.out.println();

        a.forEach(apple -> System.out.println(apple.toString()));
        a.sort(new SortByColor());

        System.out.println();

        a.forEach(apple -> System.out.println(apple.toString()));
        a.sort(new SortByVariety());

        System.out.println();
        a.forEach(apple -> System.out.println(apple.toString()));




    }
}

class SortByVariety implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getVariety().compareTo(o2.getVariety());
    }
}

class SortByColor implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getColor().name().compareTo(o2.getColor().name());
    }
}


