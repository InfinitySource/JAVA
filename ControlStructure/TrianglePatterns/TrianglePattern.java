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
        
        for(int i = n ; i >= 1; i++){
            
            for(int j = i ; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print(j);
            }
            for(int j = n; j >= 1; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }



}
