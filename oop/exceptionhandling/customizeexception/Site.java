package oop.exceptionhandling.customizeexception;

class Site {

    private void home(){
        System.out.println("Welcome to second home");
    }

    public void login(int age){
        System.out.println("welcome to this site");
        if(age >= 70){
            home();
        }else{
            throw new InvalidAgeException("age should be at least 70 or above");
        }

        System.out.println("Thank you for visit");

    }

}
