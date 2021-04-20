package ca.bcit.main.threading;

public class Threads {

    public static void main(String[] args) {

        // method 1: extend thread class
        ThreadExample.MyThread mythread = new ThreadExample.MyThread();
        mythread.start();

        // method 2: implement Runnable interface
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        // method 3: anonymous Runnable implementation
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyThread is running");
                System.out.println("MyThread finished");
            }
        };

        // method 4: lambda expression
        Runnable runLambda = () -> {

            // STOP THREAD FOR A MOMENT
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running...");
            System.out.println("MyThread is running");
            System.out.println("MyThread finished");
        };
    }
}

class ThreadExample {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread is running");
            System.out.println("MyThread finished");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread is running");
        System.out.println("MyThread finished");
    }
}

class ThreadExample7 {

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is running...");
        System.out.println("MyThread is running");
        System.out.println("MyThread finished");
    }

}

class StoppableRunnable implements Runnable {

    private boolean stopRequested = false;

    public synchronized void requestStop() {
        stopRequested = true;
    }

    @Override
    public void run() {

    }
}


