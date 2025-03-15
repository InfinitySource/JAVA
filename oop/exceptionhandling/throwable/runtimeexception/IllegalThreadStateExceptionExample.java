package oop.exceptionhandling.throwable.runtimeexception;


public class IllegalThreadStateExceptionExample{

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {
            System.out.println("Thread is running and finishing.");
        });

        myThread.start();
        myThread.join(); // Wait for the thread to finish

        try {
            myThread.start(); // Attempting to start a terminated thread
        } catch (IllegalThreadStateException e) {
            System.err.println("Caught IllegalThreadStateException: " + e.getMessage());
        }
        System.out.println("Main thread finished.");
    }
}