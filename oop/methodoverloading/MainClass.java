package oop.methodoverloading;

public class MainClass {

    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.m1(); // m1 method called.
        d1.m1(10); // int m1 method called.
        d1.m1(12,13); // int int args m1 method called.
        d1.m1(12,15,78); // int int int args m1 method called.



        Overload ol = new Overload();
        System.out.println(ol.m1(10, 20));

        long a = 10;
        float b = 20;
        System.out.println(ol.m1(a, b));

    }
}
