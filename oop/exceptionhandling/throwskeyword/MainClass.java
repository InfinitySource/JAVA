package oop.exceptionhandling.throwskeyword;


class MainClass {

public static void main(String[] args) {


    System.out.println("Program started");
    Site s = new Site();

    try{
        s.login(81);
    }catch (ClassNotFoundException | InstantiationException e){
        System.out.println(e);
    }

}

}