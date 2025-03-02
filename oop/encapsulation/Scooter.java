package oop.encapsulation;

public class Scooter extends Vehicle {

    int no_of_tyres = 2;

    void start(){
        System.out.println("Start with kick");
        System.out.println("No of tyres = " + no_of_tyres);
    }

}
