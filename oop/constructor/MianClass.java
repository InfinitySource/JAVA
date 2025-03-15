package oop.constructor;

public class MianClass {
    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo(3,4);
        Demo d3 = new Demo(40, 20);

        d1.display();
        d2.display();
        d3.display();



    }
}
