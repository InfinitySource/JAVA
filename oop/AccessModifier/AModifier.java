package oop.AccessModifier;


public class AModifier {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        PublicM pm = new PublicM();
        DefaultM dm = new DefaultM();
        ProtectedM prom = new ProtectedM();
        PrivateM privm = new PrivateM();


        pm.display();
        dm.display();
        prom.display();
        //privm.display(); // private method not access anywhere.



        // access variable
        System.out.println(a);
        display();
        System.out.println(pm.a);
        System.out.println(dm.a);
        System.out.println(prom.a);
        //System.out.println(privm.a); // can't access private variable


    }
    static void display(){
        int a = 100;
        System.out.println("AModifier Display Method called.........");
    }


}
