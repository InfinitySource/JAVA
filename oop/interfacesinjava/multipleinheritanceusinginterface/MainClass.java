package oop.interfacesinjava.multipleinheritanceusinginterface;

public class MainClass {

    public static void main(String[] args) {

        HondaCar c = new HondaCar();
        c.color();
        c.type();
        c.cc();

        System.out.println();


        Car car = new BMWCar();
        car.color();
        car.type();
        car.cc();

    }

}
