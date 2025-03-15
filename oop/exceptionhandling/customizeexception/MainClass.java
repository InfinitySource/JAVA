package oop.exceptionhandling.customizeexception;

class MainClass {

    public static void main(String[] args) {

        System.out.println("Program started");
        Site s = new Site();
        try{
            s.login(31);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }

        System.out.println("Program ended");
    }

}
