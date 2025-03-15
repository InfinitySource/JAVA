package oop.exceptionhandling.throwkeyword;

class MainClass {

    public static void main(String[] args) {


        System.out.println("Program started");

        Site s = new Site();
        try{
            s.login(28);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }

}
