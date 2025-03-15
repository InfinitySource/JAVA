package oop.interfacesinjava.multipleinheritanceusinginterface;

public class HondaCar implements Car {

    int minspeed = 40;

    @Override
    public void color() {
        System.out.println("all available in honda car");
    }

    @Override
    public void type() {
        System.out.println("Available in sedan, XUV adn hatchback");
    }

    @Override
    public void cc() {
        System.out.println("Honda available in 1000cc to 2000cc");
        System.out.println("min speed = " + minspeed);
        System.out.println("max speed = " + maxspeed);
    }
}
