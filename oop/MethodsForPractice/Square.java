package oop.MethodsForPractice;

public class Square {

    // local variable
    int a = 5;

    // using local variable 
    public void SquareUsingLV(){
        System.out.println(a * a);
    }

    // with arguments
    public void SquareWitharguments(int a){
        System.out.println(a * a);
    }


    // with return with no arguments
    public int SquareReturnNoArguments(){
        return a * a;
    }

    // with return with arguments
    public int SquareReturnWithArguments(int a){
        return a * a;
    }

}
