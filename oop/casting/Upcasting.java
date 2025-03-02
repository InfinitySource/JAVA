package oop.casting;

public class Upcasting {

    public static void main(String[] args) {


        // parent --> child
//        ____________
//        |          |
//        |  Demo1   |
//        |__________|
//
//             ^
//             |
//             |
//        ____________
//        |          |
//        |  Demo2   |
//        |__________|
//
//             ^
//             |
//             |
//        ____________
//        |          |
//        |  Demo3   |
//        |__________|

        // parent       // child
        Demo1 d1 = new Demo2();
        Demo2 d2 = new Demo3();
        Demo1 d3 = new Demo3();

        // common in both demo1 and demo2 - m1,m2,m3
        d1.m1();
        d1.m2();
        d1.m3();
        System.out.println();




        // common in both demo2 and demo3 - m1,m2,m3,m4,m5,m6
        d2.m1();
        d2.m2();
        d2.m3();
        d2.m4();
        d2.m5();
        d2.m6();
        System.out.println();


        // common in both demo2 and demo3 - m1,m2,m3
        d3.m1();
        d3.m2();
        d3.m3();
        System.out.println();


    }


}
