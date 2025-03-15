package javaassignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Admission {


    private static RuntimeException verifyUser(Students s){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        System.out.println();


        if(!name.trim().isEmpty())
            s.setName(name);
        else
            System.out.println("Problem: Name should not be empty");




        if( age > 5 ){
            s.setAge(age);
        }else{
            throw new InvalidAgeException("Age need to be more than 5");
        }

        final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        boolean checkEmail = Pattern.matches(EMAIL_REGEX, email);

//        System.out.println(checkEmail);

        if(checkEmail){
            s.setEmail(email);
        }else {
            throw new InvalidEmailException("Invalid Email Format");
        }


        final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
//        final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$";

        boolean checkPassword = Pattern.matches(PASSWORD_REGEX, password);

        if(checkPassword){
            s.setPassword(password);
        }else {
            throw new InvalidPasswordException();
        }



        return null;
    }


    static void home(Students s){


        if(s.getName() != null && s.getAge() != 0 && s.getEmail() != null && s.getPassword() != null){

            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getEmail());
            System.out.println(s.getPassword());
        }

    }


    public static void getAdmission(Students s) {

        System.out.println("============================ *** ENTER YOUR DETAILS *** ==============================");

        RuntimeException r = verifyUser(s);
        if(r == null){
            home(s);
        }else {
            throw r;
        }

    }




    public static void main(String[] args) {

        Students s = new Students();
        Scanner sc = new Scanner(System.in);

        try{
        getAdmission(s);
        }catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e){
            System.out.println(e);
        }


    }



}
