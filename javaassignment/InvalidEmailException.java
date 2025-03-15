package javaassignment;

public class InvalidEmailException extends RuntimeException {


    String msg = "Invalid Email \n example@gmail.com";



    InvalidEmailException(){}
    InvalidEmailException(String msg){
        this.msg = msg;
    }


    @Override
    public String toString() {
        return msg;
    }
}
