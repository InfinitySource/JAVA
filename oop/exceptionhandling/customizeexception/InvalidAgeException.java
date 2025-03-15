package oop.exceptionhandling.customizeexception;

class InvalidAgeException extends RuntimeException {


    private String msg = "Invalid age!!!";

    InvalidAgeException(){};
    InvalidAgeException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
