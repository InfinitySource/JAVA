package PascalConditionPatterns;

public class LeftPascalTriangles {
    
    public static void LeftPascalTriangle1(int n){

        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void LeftPascalTriangle2(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle3(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i;j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i;j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle4(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle5(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle6(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle7(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle8(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle9(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                if(i % 2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle10(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle11(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        
    }

    public static void LeftPascalTriangle12(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftPascalTriangle13(int n){

        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
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
