package oop.exceptionhandling.typeofblocks;

public class TryBlock {

    public static void main(String[] args) {

        try{
        int a = 10;
        m1();
        }catch (Exception e){
            System.out.println(e);
        }

    }
    static void m1(){
        System.out.println("M1 method");
    }

}
