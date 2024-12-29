package AllPatternsMethods;

public class ReverseLeftHalfPyramid {
    
    public static void ReverseLeftHalfPyramidStar(int n){

        for(int i = 1; i <= n;i++){
            
            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void ReverseLeftHalfPyramidCapitalChar1(int n){

        int count = 1;

        for(int i = 1; i <= n;i++){
            
            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (count + 64));
                count++;
            }
            System.out.println();
        }

    }
    public static void ReverseLeftHalfPyramidCapitalChar2(int n){

        int count = (n*(n+ 1)) /2;

        for(int i = 1; i <= n;i++){
            
            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (count + 64));
                count--;
            }
            System.out.println();
        }

    }

    public static void ReverseLeftHalfPyramidCapitalChar3(int n){

        int count = 5;

        for(int i = n; i >= 1;i--){
            
            int c = count;

            for(int j = i; j < n;j++){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){
                System.out.print((char) (c + 64));
                c--;
            }
            System.out.println();
            count += i -1;
        }

    }

    public static void ReverseLeftHalfPyramidCapitalChar4(int n){

        int count = 5;

        for(int i = n; i >= 1;i--){
            
            int c = count;

            for(int j = i; j < n;j++){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){
                System.out.print((char) (c + 64));
                c--;
            }
            System.out.println();
            count += i -1;
        }

    }
    
    public static void ReverseLeftHalfPyramidCapitalChar5(int n){
        int count = 1;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }
            
            for(int j = n; j >= i; j--){
                System.out.print((char) (c + 64));
                c += j;
            }
            System.out.println();
            count++;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar6(int n){
        int count = 5;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = n; j >= i; j--){
                System.out.print((char) (c + 64));
                c += j -1;
            }
            System.out.println();
            count--;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar7(int n){
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = n; j >= i; j--){
                System.out.print((char) (c + 64));
                c -= j;
            }
            System.out.println();
            count--;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar8(int n){
        int count = 11;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = n; j >= i; j--){
                System.out.print((char) (c + 64));
                c -= j-1;
            }
            System.out.println();
            count++;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar9(int n){
        int count = 1;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (c + 64));
                c += j+1;
            }
            System.out.println();
            count+=i;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar10(int n){
        int count = 1;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (c + 64));
                c += j;
            }
            System.out.println();
            count += i+1;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar11(int n){
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (c + 64));
                c -= j+1;
            }
            System.out.println();
            count -= i;
        }
    }

    public static void ReverseLeftHalfPyramidCapitalChar12(int n){
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n;i++){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print((char) (c + 64));
                c -= j;
            }
            System.out.println();
            count -= i+1;
        }
    }


}
