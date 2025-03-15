package oop.AccessModifier;

public class ProtectedM extends DemoClass {
//    public static void main(String[] args) {
//    }

    protected int a = 30;


    @Override
    protected void display() {
        System.out.println("Protected method called...");
    }
}
