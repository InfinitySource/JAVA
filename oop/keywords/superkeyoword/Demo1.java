package oop.keywords.superkeyoword;

public class Demo1 {

    int a = 10;

    void display(){
        System.out.println("Display method of Demo1");
        System.out.println("a=" + a);
    }

    Demo1(){
        System.out.println("default const. of Demo1");
    }

    Demo1(int n){
        System.out.println("user-define const. of Demo1");
    }



}
