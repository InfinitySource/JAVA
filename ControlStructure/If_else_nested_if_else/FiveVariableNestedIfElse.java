package If_else_nested_if_else;

public class FiveVariableNestedIfElse {
    
    public static void FiveVariable(int a,int b,int c,int d,int e){
        
        if(a > b){
            if(a > c){
                if(a > d){
                    if(a > e){
                        System.out.println("a");
                    }else{
                        System.out.println("e");
                    }
                }else{
                    if(d > e){
                        System.out.println("d");
                    }else{
                        System.out.println("e");
                    }
                }
            }else{
                if(c > d){
                    if(c > e){
                        System.out.println("c");
                    }else{
                        System.out.println("e");
                    }
                }else{
                    if(d > e){
                        System.out.println("d");
                    }else{
                        System.out.println("e");
                    }
                }
            }
        }else{
            if(b > c){
                if(b > d){
                    if(b > e){
                        System.out.println("b");
                    }else{
                        System.out.println("e");
                    }
                }else{
                    if(d > e){
                        System.out.println("b");
                    }else{
                        System.out.println("e");
                    }
                }
            }else{
                if(c > d){
                    if(c > e){
                        System.out.println("c");
                    }else{
                        System.out.println("e");
                    }
                }else{
                    if(d > e){
                        System.out.println("d");
                    }else{
                        System.out.println("e");
                    }
                }
            }
        }
        
    }   

}
