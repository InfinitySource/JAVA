package oop.constructor;

public class Demo {


    int a, b;

    void display(){
        System.out.println("a=" + a + " b=" + b);
    }


    Demo(){
        a = 10;
        b = 20;
        System.out.println("Default constructor");
    }

    Demo(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parameterized/ user-define constructor");
    }




}
