package oop.exceptionhandling.throwable.exception;

import java.util.Scanner;

public class IOException {


    public static void main(String[] args)
    {

        Scanner scan = new Scanner("Hello");


        System.out.println("" + scan.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception Output: "
                + scan.ioException());

        scan.close();
    }

}
