package KPatterns;

public class RightKPatterns {

    public static void RightKPatternUsingFourForLoop(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++){

            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void RightKPattern1(int n){

        for(int i = 1; i <= (n*2) - 1; i++){

            if(i <= n){

                for(int j = i; j <= n; j++){
                    System.out.print("*");
                }
            
            }else{
                for(int j = (n* 2) - i; j <= n; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }

    public static void RightKPattern2(int n){

        for(int i = n; i >= 1; i--){
            
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }

    public static void RightKPattern3(int n){

        for(int i = n; i >= 1; i-- ){
            
            for(int j = i; j >= 1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++){

            for(int j = i; j >= 1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void RightKPattern4(int n){

        for(int i = n; i >= 1 ; i--){
            
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++){

            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void RightKPattern5(int n){

        for(int i = 1; i <= n ; i++){
            
            for(int j = n; j >= i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--){

            for(int j = n; j >= i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void RightKPattern6(int n){

        for(int i = 1; i <= n ; i++){
            
            for(int j = i; j <= n;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = n - 1; i >= 1 ; i--){
            
            for(int j = i; j <= n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void RightKPattern7(int n){

        for(int i = n; i >= 1 ; i--){
            
            for(int j = 1; j <= i;j++){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }

        for(int i = 2; i <= n ; i++){
            
            for(int j = 1; j <= i;j++){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }

        
    }

    public static void RightKPattern8(int n){

        for(int i = n; i >= 1 ; i--){
            
            for(int j = 1; j <= i;j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = 2; i <= n ; i++){
            
            for(int j = 1; j <= i;j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        
    }

    public static void RightKPattern9(int n){

        for(int i = n; i >= 1 ; i--){
            
            for(int j = i; j >= 1;j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = 2; i <= n ; i++){
            
            for(int j = i; j >= 1;j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        
    }

    public static void RightKPattern10(int n){

        for(int i = 1; i <= n ; i++){
            
            for(int j = n; j >= i;j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1 ; i--){
            
            for(int j = n; j >= i;j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        } 
    }

    public static void RightKPattern11(int n){

        for(int i = 1; i <= n ; i++){
            
            for(int j = i; j <= n;j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1 ; i--){
            
            for(int j = i; j <= n;j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        
    }

    




    
}
