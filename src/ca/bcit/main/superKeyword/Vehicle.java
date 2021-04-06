package ca.bcit.main.superKeyword;

public class Vehicle {

    int maxSpeed = 120;

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    Vehicle(int maxSpeed) {
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }

    public void vroom(){
        System.out.println("Vroom Vroom!");
    }
}

class Car extends Vehicle {


    Car(){
        // must call super keyword in child class
        // super keyword has to be above all other code
        // in the constructor
        super();

    }

    int maxSpeed = 100;

    // to use super on a variable
    public void display(){
        // super on variables will get the superclasses property
        System.out.println(super.maxSpeed);
    }

    // to use super on a method
    public void vroom() {
        // reference superclass and call method from it
        super.vroom();
    }
}