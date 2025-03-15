package oop.keywords.superkeyoword;

public class Demo3 extends Demo2 {

    int a = 30;


    void display() {
        System.out.println("Display method of Demo3");
        System.out.println("a="+super.a);
        super.display();
    }

    Demo3(){
        System.out.println("default const. of Demo3");
    }

    Demo3(int a){
        super(20);
        System.out.println("user-define const. Demo3");
    }

}
