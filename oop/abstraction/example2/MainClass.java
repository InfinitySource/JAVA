package oop.abstraction.example2;

public class MainClass {
    public static void main(String[] args) {

        Laptop l = new Laptop();
        Mobile m =new Mobile();
        l.start();
        l.config();

        m.start();
        m.config();
    }
}
