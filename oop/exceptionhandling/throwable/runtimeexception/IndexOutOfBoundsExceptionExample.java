package oop.exceptionhandling.throwable.runtimeexception;

public class IndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        int[] arr = new int[5];

        try{
            arr[6] = 10;
            System.out.println("added number in array successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
