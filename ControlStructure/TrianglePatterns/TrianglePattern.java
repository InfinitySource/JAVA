package TrianglePatterns;

public class TrianglePattern {
    
    // public static void TriangleStar(int n){
        
    //     for(int i = 1; i <= n; i++){
            
    //         for(int j = i; j < n; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 1; j <= (i*2)-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void Triangle1(int n){
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Triangle2(int n){
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i*2)-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Triangle3(int n){
        
        for(int i = n; i >= 1; i--){
            
            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((n - i + 1)*2) - 1 ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Triangle4(int n){
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            for(int j = i-1; j >= 1 ; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }

    public static void Triangle5(int n){
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1 ; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i ; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }

    public static void Triangle6(int n){
        
        for(int i = n ; i >= 1; i--){
            
            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print(j);
            }
            for(int j = i+1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Triangle7(int n){
        
        for(int i = n ; i >= 1; i--){

            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            for(int j = n-1; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Triangle8(int n){
        
        for(int i = 1 ; i <= n; i++){

            for(int j = i ; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(i % 2 != 0){
                    System.out.print((char)(i+ 64));
                }else{
                    System.out.print((char)(i+ 96));
                }
            }
            for(int j = 2; j <= i; j++){
                if(i % 2 != 0){
                    System.out.print((char)(i+ 64));
                }else{
                    System.out.print((char)(i+ 96));
                }
            }
            System.out.println();
        }
    }

    public static void Triangle9(int n){
        
        for(int i = n ; i >= 1; i--){

            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                if(i % 2 != 0){
                    System.out.print((char)(i+ 64));
                }else{
                    System.out.print((char)(i+ 96));
                }
            }
            for(int j = i; j < n; j++){
                if(i % 2 != 0){
                    System.out.print((char)(i+ 64));
                }else{
                    System.out.print((char)(i+ 96));
                }
            }
            System.out.println();
        }
    }

    public static void Triangle10(int n){
        
        for(int i = 1; i <= n; i++){

            for(int j = i ; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            for(int j = i-1; j >= 1 ; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            System.out.println();
        }
    }

    public static void Triangle11(int n){
        
        for(int i = 1; i <= n; i++){

            for(int j = i ; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            for(int j = 2; j <= i ;j++){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            System.out.println();
        }
    }

    public static void Triangle12(int n){

        for(int i = n ; i >= 1; i--){
            
            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            for(int j = i+1; j <= n; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            System.out.println();
        }
    }

    public static void Triangle13(int n){

        for(int i = n ; i >= 1; i--){

            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            for(int j = n-1; j >= i; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j+ 64));
                }else{
                    System.out.print((char)(j+ 96));
                }
            }
            System.out.println();
        }
    }

    

}
