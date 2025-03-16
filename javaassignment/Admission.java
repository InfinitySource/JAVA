package javaassignment;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Pattern;

public class Admission {


    private static RuntimeException verifyUser(Students s) {


        Scanner sc = new Scanner(System.in);

        // Id
        UUID uuid = UUID.randomUUID();

        s.setId(uuid.toString());


        // Name
        while (true) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            if (!name.trim().isEmpty()) {
                s.setName(name);
                break;
            } else {
                System.out.println("Name should not be empty");
            }

        }


        // Age
        while (true) {

            try {
                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                if (age > 5) {
                    s.setAge(age);
                    break;
                } else {
                    throw new InvalidAgeException("Age need to be more than 5");
                }
            } catch (InvalidAgeException e) {
                System.out.println(e);
            }catch (InputMismatchException e){
                System.out.println("Age should be in Number");
                sc.next();
            }

        }


        // Email

        while (true) {

        final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            try{

            System.out.print("Enter Email: ");
            String email = sc.next();

            boolean checkEmail = Pattern.matches(EMAIL_REGEX, email);


                if (checkEmail) {
                    s.setEmail(email);
                    break;
                }else {
                        throw new InvalidEmailException();
                }
            }catch (InvalidEmailException e){
                System.out.println(e);
            }

        }



        while (true){


            final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

            try{
            System.out.print("Enter Password: ");
            String password = sc.next();

            boolean checkPassword = Pattern.matches(PASSWORD_REGEX, password);

            if(checkPassword){
                s.setPassword(password);
                break;
            }else {
                throw new InvalidPasswordException();
            }

            }catch (InvalidPasswordException e){
                System.out.println(e);
            }




        }


//        System.out.print("Enter Age: ");
//        int age = sc.nextInt();
//        System.out.print("Enter Email: ");
//        String email = sc.next();
//        System.out.print("Enter Password: ");
//        String password = sc.next();
//        System.out.println();


//        if(name.trim().isEmpty()){
//            System.out.println("Problem: Name should not be empty");
//            if(age < 5){
//                System.out.println("Problem: Age need to be more than 5");
//
//                boolean checkEmail = Pattern.matches(EMAIL_REGEX, email);
//                if(!checkEmail){
//                    throw new InvalidEmailException("Invalid Email Format");
//
//                    boolean checkPassword = Pattern.matches(PASSWORD_REGEX, password);
//
//                    if(!checkPassword){
//                        throw new InvalidPasswordException();
//                    }else{
//                        s.setPassword(password);
//                    }
//
//                }else{
//                    s.setEmail(email);
//                }
//
//            }else{
//                s.setAge(age);
//            }
//
//        }else{
//            s.setName(name);
//        }


//        if (!name.trim().isEmpty()){
//            s.setName(name);
//        } else{
//            System.out.println("Problem: Name should not be empty");
//        }


//
//        if( age > 5 ){
//            s.setAge(age);
//        }else{
//            throw new InvalidAgeException("Problem: Age need to be more than 5");
//        }


//        System.out.println(checkEmail);
//
//        final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//
//        boolean checkEmail = Pattern.matches(EMAIL_REGEX, email);
//
//        if (checkEmail) {
//            s.setEmail(email);
//        } else {
//            throw new InvalidEmailException();
//        }
//
//
//
//        final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$";
//
//        final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
//
//        boolean checkPassword = Pattern.matches(PASSWORD_REGEX, password);
//
//
//        if(checkPassword){
//            s.setPassword(password);
//        }else {
//            throw new InvalidPasswordException();
//        }
//


        return null;
    }


    static void home(Students s) {


        if (s.getName() != null && s.getAge() != 0 && s.getEmail() != null && s.getPassword() != null) {


            System.out.println();
            System.out.println("===================");
            System.out.println("ID: " + s.getId());
            System.out.println("NAME: " +s.getName());
            System.out.println("AGE: " + s.getAge());
            System.out.println("EMAIL: " + s.getEmail());
            System.out.println("PASSWORD: " + s.getPassword());
            System.out.println("===================");
        }

    }


    public static void getAdmission(Students s) {

        System.out.println("============================ *** ENTER YOUR DETAILS *** ==============================");

        RuntimeException r = verifyUser(s);
        if (r == null) {
            home(s);
        } else {
            throw r;
        }

    }


    public static void main(String[] args) {

        Students s = new Students();

        try {
            getAdmission(s);
        } catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e) {
            System.out.println(e);
        }


    }


}
