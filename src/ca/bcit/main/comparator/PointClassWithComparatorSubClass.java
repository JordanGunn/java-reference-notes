package ca.bcit.main.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PointClassWithComparatorSubClass {

    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 4));
        pointList.add(new Point(3, 3));
        pointList.add(new Point(4, 2));
        pointList.add(new Point(5, 1));

        // PASS NEW COMPARATOR OBJECT TO COLLECTIONS
        Collections.sort(pointList, new Point.SortByY());
        for (Point p: pointList) {
            System.out.println(p.toString());
        }
    }
}

class Point {

    private int x;
    private int  y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // STATIC INNER CLASSES FOR COMPARE INTERFACE
    static class SortByX implements Comparator<Point> {

        public int compare (Point p1, Point p2) {
            if (p1.getX() == p2.getX()) {
                return 0;
            }
            else if (p1.getX() < p2.getX()) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }

    // STATIC INNER CLASSES FOR COMPARE INTERFACE
    static class SortByY implements Comparator<Point> {

        public int compare (Point p1, Point p2) {
            if (p1.getY() == p2.getY()) {
                return 0;
            }
            else if (p1.getY() < p2.getY()) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
}


