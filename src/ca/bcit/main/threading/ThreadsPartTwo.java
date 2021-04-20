package ca.bcit.main.threading;

import ca.bcit.main.generics.MyClass;

public class ThreadsPartTwo {
    // A thread is a single sequence of execution within a program
    // multithreading refers to the multiple threads of control within a certain program
    // each program can run multiple threads of control

    // WHAT ARE THREADS GOOD FOR
    // To maintain responsiveness of an application
    // To enable cancellation of seperable tasks
    // Some problems are intrinsically parallel
    // to monitor the status of some resource (e.g. a DB)
    // Some APIs and systems demansd it (e.g. APIs)


    // When we execute an application:
    //      The JVM creates a Thread object whose task is defined by the main method
    //      It starts the thread
    //      The thread executes the methods of the program until the program dies

    // Each thread has a private runtime stack
    // If two threads execute the same method, each will have its own  copy of the local variables
    // All threads see the same dynamic memory

    // THERE ARE TWO WAYS TO CREATE OUR OWN THREAD OBJECT
    //      1. Subclassing the Thread class and instantiating a new object of that class
    //      2. Implementing the Runnable interface
    //      In both cases, we need to call the run() method
}

// CREATING THREADS BY EXTENDING THE THREAD CLASS
class ThreadExtend extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("ID: " +Thread.currentThread().getId() + " Value: " + i);
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ID: " +Thread.currentThread().getId() + " Value: " + i);
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Demo {
    public static void main(String[] args) {

        // start thread using EXTENDS THREAD
        ThreadExtend myClass = new ThreadExtend();
        myClass.start();
        ThreadExtend myClass1 = new ThreadExtend();
        myClass1.start();

        Thread t1 = new Thread(new ThreadRunnable());
        Thread t2 = new Thread(new ThreadRunnable());
        t1.start();
        t2.start();

    }
}
