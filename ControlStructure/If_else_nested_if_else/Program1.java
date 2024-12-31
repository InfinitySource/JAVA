package If_else_nested_if_else;

public class Program1{

    public static void main(String[] args){
        
        int a = 4000, b = 5000, c = 3000;
    
        if(a > b){
            if(a > c){
                System.out.print("a is bigger");
            }else{
                System.out.println("c is bigger");
            }
        }else{
            if(b > c){
                if(b > a){
                    System.out.print("b is bigger");
                }else{
                    System.out.print("a is bigger");
                }
            }
        }



    } 

}