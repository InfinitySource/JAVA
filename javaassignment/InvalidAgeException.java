package javaassignment;

public class InvalidAgeException extends RuntimeException {

    private String msg = "Age need to be more than 5";

    InvalidAgeException(){}
    InvalidAgeException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
