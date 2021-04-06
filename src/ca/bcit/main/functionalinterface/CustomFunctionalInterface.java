package ca.bcit.main.functionalinterface;

import java.awt.print.Printable;

@FunctionalInterface
interface CustomFunctionalInterface {

    void print(String message);

    static String capitalize(String message) {
        return message.toUpperCase();
    }
    static String lowerize(String message) {return message.toLowerCase();}
}

class functionalInterfaceTest {

    public static void test() {
        // ASSIGN FUNCTIONAL INTERFACE TO LAMBDA EXPRESSION
        CustomFunctionalInterface printer = new CustomFunctionalInterface() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print(CustomFunctionalInterface.capitalize("Hello, world!"));
        printer.print(CustomFunctionalInterface.lowerize("HELLO, WORLD!"));
    }
}
