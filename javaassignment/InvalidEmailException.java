package javaassignment;

public class InvalidEmailException extends RuntimeException {


    String msg = "Invalid Email Format \n example@gmail.com \n example@hotmail.com \n example@live.com ";



    InvalidEmailException(){
    }
    InvalidEmailException(String msg){
        System.out.println("prin");
        this.msg = msg;
    }


    @Override
    public String toString() {
        return msg;
    }
}
