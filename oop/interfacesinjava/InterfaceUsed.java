package oop.interfacesinjava;


interface I1{

//    public static final int a = 10;
    int a = 10;    // already written public static final in front of all variable and public to all methods

    void show();

    default void show2(){
        System.out.println("default interface method called......");
    }
    
    static void show3(){
        System.out.println("static interface method called.......");
    }


}


interface I2{
    
    int b = 20;
    void show();
    
    void display();
    default void run(){
        System.out.println("default method run called.... in I2");
    }

    static void run2(){
        System.out.println("static method run called.... in I2");
    }


}


public class InterfaceUsed implements I1,I2{

    int a = 30;

    public void show(){
        System.out.println("show with body in class method called.......");
    }

    public void display(){
        System.out.println("display method from I2 in class InterfaceUser called.....");
    }


}
