package oop.exceptionhandling.throwable.runtimeexception;

public class NegativeArraySizeExceptionExample {

    public static void main(String[] args) {

        int size = -5;

        try {
            int[] myArray = new int[size]; // Attempt to create an array with negative size
            System.out.println("Array created successfully."); // This line won't be reached
        } catch (NegativeArraySizeException e) {
            System.err.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

    }

}
