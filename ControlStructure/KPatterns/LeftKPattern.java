package KPatterns;

public class LeftKPattern {

    public static void LeftKPattern1(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void LeftKPattern2(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void LeftKPattern3(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void LeftKPattern4(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){  
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){  
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void LeftKPattern5(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftKPattern6(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){  
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){  
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftKPattern7(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void LeftKPattern8(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                if(i%2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                if(i%2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftKPattern9(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                if(i%2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                if(i%2 != 0){
                    System.out.print((char)(i + 64));
                }else{
                    System.out.print((char)(i + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftKPattern10(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftKPattern11(int n) {

        for (int i = n; i >= 1; i--) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            
            for(int j = i; j < n; j++){  
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftKPattern12(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void LeftKPattern13(int n) {

        for (int i = 1; i <= n; i++) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            
            for(int j = i; j > 1; j--){  
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){  
                if(j%2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

}
