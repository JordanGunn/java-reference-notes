package ca.bcit.main.oopBasics;

public class Pen {

    String type = "gel";
    String color = "blue";
    int point = 10;
    static boolean clicked = false;

    public static void main(String[] args) {
        System.out.println();
    }

    public void click(){
        clicked = true;
    }

    public void unclicked(){
        clicked = false;
    }
}
