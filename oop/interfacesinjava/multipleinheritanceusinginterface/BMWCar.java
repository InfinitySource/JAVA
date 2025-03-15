package oop.interfacesinjava.multipleinheritanceusinginterface;

public class BMWCar implements Car {

    int minspeed = 80;

    @Override
    public void color() {
        System.out.println("available in color blue, red");
    }

    @Override
    public void type() {
        System.out.println("Available in sedan and XUV");
    }

    @Override
    public void cc() {
        System.out.println("Honda available in 2000cc to 4000cc");
        System.out.println("min speed = " + minspeed);
        System.out.println("max speed = " + maxspeed);
    }

}
