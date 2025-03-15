package oop.abstraction;

abstract class Demo {


    Demo() {
        System.out.println("Default const. called");
    }

    Demo(int a){
        this();
        System.out.println("user-define const. called");
    }


    void m1(){
        System.out.println("M1 method called");
    }

    abstract void m2();


}
