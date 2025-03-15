package oop.exceptionhandling.throwskeyword;

class Site {
    private void home(){
        System.out.println("welcome to second home");
    }

    public void login(int age) throws ClassNotFoundException, InstantiationException {
        System.out.println("welcome to this site");
        if(age >= 70)
            home();

        System.out.println("Thank you for visit");

    }

}
