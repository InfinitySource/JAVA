package PascalConditionPatterns;

public class RightPascalTriangle {
    
    // public static void main(String[] args) {
        
    // }

    public static void RightPascalPattern1(int n){
        
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = i; j >= 1;j--) 
                {
                    System.out.print("*");
                }
            }
            else{
                for(int j = (n*2) - i; j >= 1;j--)
                {
                    System.out.print("*");
                }
            }
           System.out.println();
        }

        
    }

    public static void RightPascalPattern2(int n){
        
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = i; j >= 1;j--) 
                {
                    System.out.print(i);
                }
            }
            else{
                for(int j = (n*2) - i; j >= 1;j--)
                {
                    System.out.print((n*2) - i);
                }
            }
           System.out.println();
        }

        
    }
    
    public static void RightPascalPattern3(int n){
        
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = i; j >= 1 ;j--) 
                {
                    System.out.print(j);
                }
            }
            else{
                for(int j = (n*2) - i ; j >= 1 ;j--)
                {
                    System.out.print(j);
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern4(int n){
        
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = 1; j <= i ;j++) 
                {
                    System.out.print(j);
                }
            }
            else{
                for(int j = 1 ; j <= (n*2) - i ; j++)
                {
                    System.out.print(j);
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern5(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = n; j >= n- i + 1 ;j--) 
                {
                    System.out.print(j);
                }
            }
            else{
                for(int j = n; j >= i - n + 1 ; j--)
                {
                    System.out.print(j);
                }
            }
           System.out.println();
        }  
       
    }

    public static void RightPascalPattern6(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = n - i + 1; j <= n ;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j = i - n + 1; j <= n; j++){
                    System.out.print(j);
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern7(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = i; j >= 1 ;j--){
                    if(i % 2 != 0){
                        System.out.print((char)(i + 64));
                    }else{
                        System.out.print((char)(i + 96));
                    }
                }
            }
            else{
                for(int j = (n * 2 ) - i; j >= 1 ;j--){
                    if(i % 2 != 0){
                        System.out.print((char)((n* 2) - i + 64));
                    }else{
                        System.out.print((char)((n* 2) - i + 96));
                    }
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern8(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = 1; j <= i ;j++){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
            else{
                for(int j = 1; j <= (n* 2) - i; j++){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern9(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = i; j >= 1; j--){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
            else{
                for(int j = (n*2) - i; j >= 1; j--){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern10(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = n; j >= n - i + 1; j--){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
            else{
                for(int j = n; j >= i - n + 1; j--){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
           System.out.println();
        }  
    }

    public static void RightPascalPattern11(int n){
       
        for(int i = 1; i <= (n*2) - 1; i++){
           
            if(i <= n){
                for(int j = n - i + 1; j <= n; j++){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
            else{
                for(int j = i - n + 1; j <= n; j++){
                    if(j % 2 != 0){
                        System.out.print((char)(j + 64));
                    }else{
                        System.out.print((char)(j + 96));
                    }
                }
            }
           System.out.println();
        }  
    }



    
}
