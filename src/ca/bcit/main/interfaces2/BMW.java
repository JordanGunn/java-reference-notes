package ca.bcit.main.interfaces2;

public class BMW implements Car, Loggable, Asset, Property {

    public void drive() {
        System.out.println("BMW driving...");
    }

    public int value() {
        return 80000;
    }

    public String owner() {
        return "Jordan";
    }

    public String message() {
        return "I am the car of the Jordan";
    }
}
