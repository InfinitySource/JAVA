package oop.AccessModifier.AccessMInnerPackage;
import oop.AccessModifier.DefaultM;
import oop.AccessModifier.PrivateM;
import oop.AccessModifier.ProtectedM;
import oop.AccessModifier.PublicM;

public class CheckAMScope {
    public static void main(String[] args) {

        PublicM pm = new PublicM();
        ProtectedM prom = new ProtectedM();
        DefaultM dm = new DefaultM();
        PrivateM privm = new PrivateM();
        AClass ac = new AClass();

//        pm.display();
//        prom.display();
//        dm.display();
//        privm.display();

        System.out.println(ac.a);
        ac.display();



    }


}

class AClass {
    int a = 1000;

    // access possible
//        public void display(){
//            System.out.println("A subclass is called.......");
//        }

    // access possible
//        protected void display(){
//            System.out.println("A subclass is called.......");
//        }

    // access possible
    void display(){
        System.out.println("A subclass is called.......");
    }


    // access possible
//    private void display(){
//        System.out.println("A subclass is called.......");
//    }



}



