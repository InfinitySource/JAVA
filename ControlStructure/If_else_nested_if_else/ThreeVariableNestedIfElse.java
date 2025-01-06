package If_else_nested_if_else;

public class ThreeVariableNestedIfElse {
    
    public static void ThreeVariable(int a, int b, int c) {
        
        if(a>b){
            if(a > c){
                System.out.println("a is bigger");
            }else{
                System.out.println("c is bigger");
            }
        }else{
            if(b > c){
                System.out.println("b is biggger");
            }else{
                System.out.println("c is biggger");
            }
        }


    }
}



      

        
