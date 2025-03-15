package oop.methodoverloading;

public class Demo {


    void m1(){
        System.out.println("m1 method called");
    }

    void m1(int a){
        System.out.println("int m1 method called");
    }

    void m1(int a, int b){
        System.out.println("int int args m1 method called");
    }

    void m1(int a, int b , int c){
        System.out.println("int int int args m1 method called");
    }



}
