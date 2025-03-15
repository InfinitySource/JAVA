package oop.keywords.thiskeyword;

public class Demo {

    int a = 100;


    void display(){
        int a = 1000;
        System.out.println(this);
        System.out.println("a= " + this.a);
    }


    Demo(){
        this(10);
        System.out.println("default const. of Demo");
    }

    Demo(int n){
        System.out.println("user define const. of Demo");
    }



}
