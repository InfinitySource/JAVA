package oop.InputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TypesOfInputCreation {
   public static void main(String[] args) throws IOException {


      // Types of Input Creation
       // 1. by using Command Line
//      System.out.println(args.length);
//      int a = Integer.parseInt(args[0]);
//      int b = Integer.parseInt(args[1]);
      // for getting answer type java TypesOfInputCreation.java 10 20

//      System.out.println("Sum = "+ (a + b));

      // 2. by using BufferedReader
      inputUsingBufferedReader();

      // 3.by using Scanner
      inputUsingScanner();

   }

   public static void inputUsingBufferedReader() throws IOException {

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("Enter Value: ");
      int a = Integer.parseInt(br.readLine());
      System.out.print("Enter Value: ");
      int b = Integer.parseInt(br.readLine());

      System.out.println("Sum = " + (a + b));
   }
   public static void inputUsingScanner(){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Value: ");
      int a = sc.nextInt();
      System.out.print("Enter Value: ");
      int b = sc.nextInt();

      System.out.println("Sum = " + (a + b));
   }
}
