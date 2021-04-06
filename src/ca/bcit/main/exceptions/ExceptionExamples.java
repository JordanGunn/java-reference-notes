package ca.bcit.main.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {

    }

    public void exceptionBasics(int balance) {

        // When you throw an exception you are
        // throwing an object of the Exception class

        int amount = 1;

        if (amount > balance) {
            throw new IllegalArgumentException("ammount exceeds blance");
        }
    }

    public void fileIoExceptionExample() {

        // place code in try block
        try {
            String fileName = "test.txt";
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            String input = in.next();
            int value = Integer.parseInt(input);

            // catch different exceptions
        } catch(IOException e) {

            e.printStackTrace();

            // catch different exceptions
        } catch(NumberFormatException e) {
            System.out.println("Input was not a number");
        } finally {
            System.out.println("Completed the codeblock");
        }
    }
}

class CreateCustomCheckedException extends Exception {

    public CreateCustomCheckedException(String errorMessage) {
        super(errorMessage);
    }
}

class CreateCustomUncheckedException extends RuntimeException {
    public CreateCustomUncheckedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
