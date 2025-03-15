package oop.interfacesinjava.example2;

class DemoClass implements Demo2 {

    DemoClass(){
        m1();
        System.out.println("Default const. called");
    }

    @Override
    public void m1() {
        System.out.println("m1 method of DemoClass");
    }

    @Override
    public void m2() {
        System.out.println("m2 method of DemoClass");
    }

}
