package oop.exceptionhandling.throwable.runtimeexception;

public class StringOutOfBoundExceptionExample {

    public static void main(String args[])
    {
        try {
            String a = "Hello world!"; // length is 12
            char c = a.charAt(14); // accessing 14th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

}
