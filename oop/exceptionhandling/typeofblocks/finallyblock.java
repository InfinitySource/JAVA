package oop.exceptionhandling.typeofblocks;

public class FinallyBlock {

    public static void main(String[] args) {

        System.out.println("program start");

        String s = "India";

        try{
            System.out.println(s.length());
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block called");
        }

        System.out.println("program end");

    }
}
