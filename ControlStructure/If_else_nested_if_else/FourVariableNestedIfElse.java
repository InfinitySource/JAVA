package If_else_nested_if_else;

public class FourVariableNestedIfElse {
    
    
    public static void FourVariable(int a,int b,int c,int d){
        
        if(a > b){
            if(a > c){
                if(a > d){
                    System.out.println("a is bigger");
                }else{
                    System.out.println("d is bigger");
                }
            }else{
                if(c > d){
                    System.out.println("c is bigger");
                }else{
                    System.out.println("d is bigger");
                }
            }
        }else{
            if(c > a){
                if(c > b){
                    System.out.println("c is bigger");
                }else{
                    System.out.println("b is bigger");
                }
            }else{
                if(d > a){
                    System.out.println("d is bigger");
                }else{
                    System.out.println("a is bigger");
                }
            }
        }
        
    }   
}
