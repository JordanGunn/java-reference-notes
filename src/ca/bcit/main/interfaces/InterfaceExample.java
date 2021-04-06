package ca.bcit.main.interfaces;

// an outline of all properties and methods in a class
interface WaterBottleInterface {

    String color = "Blue";

    void fillUp();
    void pourOut();
}

// in order to use interface, ALL methods must be implemented
// to use an interface, pass "implements" keyword
public class InterfaceExample implements WaterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {

    }
}
