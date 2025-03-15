package oop.interfacesinjava.defaultininterface;

class DemoClass implements Demo1, Demo2 {

    @Override
    public void m3() {
        Demo1.super.m3();
        Demo2.super.m3();
    }
}
