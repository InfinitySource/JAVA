package oop.exceptionhandling.throwkeyword;

class Site {
    private void home(){
        System.out.println("welcome to second home");
    }

    public void login(int age){
        System.out.println("welcome to this site");

        if(age >= 70){
            home();
        }else {
            throw new ArithmeticException();
        }

        System.out.println("Thank you for visit");

    }

}
