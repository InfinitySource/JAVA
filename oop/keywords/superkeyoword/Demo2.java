package oop.keywords.superkeyoword;

public class Demo2 extends  Demo1{

    int a = 20;


    void display() {
        System.out.println("Display method of Demo2");
        System.out.println("a="+super.a);
    }

    Demo2(){
        System.out.println("default const. of Demo2");
    }

    Demo2(int a){
        super(10);
        System.out.println("user-define const. Demo2");
    }



}
