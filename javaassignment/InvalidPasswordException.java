package javaassignment;

public class InvalidPasswordException extends RuntimeException {

    String msg = "Invalid Password Format \n Password required length more than 8 \n Password required at least 1 digit \n Password required at least 1 uppercase letter \n Password required at least 1 lowercase letter \n Password required at least 1 special character ";

    InvalidPasswordException(){}
    InvalidPasswordException(String msg){
        this.msg = msg;
    }


    @Override
    public String toString() {
        return msg;
    }



}
