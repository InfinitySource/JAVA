package TrianglePatterns;

public class SandglassAndDiamondPatterns {

    public static void Sandglass1(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Diamond2(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            for (int j = i; j > 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            for (int j = i; j > 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Sandglass3(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            for (int j = i; j > 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            for (int j = i + 1; j > 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Diamond4(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void Sandglass5(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Sandglass6(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Sandglass7(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if(i %2 != 0){
                    System.out.print((char) (i + 64));
                }else{
                    System.out.print((char) (i + 96));
                }
            }
            for (int j = i; j < n; j++) {
                if(i %2 != 0){
                    System.out.print((char) (i + 64));
                }else{
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if(i %2 != 0){
                    System.out.print((char) (i + 64));
                }else{
                    System.out.print((char) (i + 96));
                }
            }
            for (int j = i; j < n; j++) {
                if(i %2 != 0){
                    System.out.print((char) (i + 64));
                }else{
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println();
        }
    }

    public static void Diamond8(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }

    public static void Sandglass9(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = n-1; j >= i; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = n-1; j >= i; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }
    }


    public static void Sandglass10(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = 2; j <= i; j++) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if(j % 2 != 0){
                    System.out.print((char)(j + 64));
                }else{
                    System.out.print((char)(j + 96));
                }
            }
            for (int j = 2; j <= i; j++) {
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
