package oop.exceptionhandling.throwable.runtimeexception;

public class NumberFormatExceptionExample {

    public static void main(String args[])
    {
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

}
