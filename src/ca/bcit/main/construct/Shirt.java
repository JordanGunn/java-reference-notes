package ca.bcit.main.construct;

public class Shirt {

    protected String color;
    public char size;

    // define a constructor by creating a method with
    // the same name as the class
    Shirt() {}
    Shirt(String color, char size) {
        this.color = color;
        this.size = size;
    }

    public void putOn(){
        System.out.println("Shirt is on!");
    }

    public void takeOff(){
        System.out.println("Shirt is off!");
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
