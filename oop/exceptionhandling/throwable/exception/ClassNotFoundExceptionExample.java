package oop.exceptionhandling.throwable.exception;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {

        try{
            Class.forName("notClass");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }


    }
}
