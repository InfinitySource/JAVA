package AllPatternsMethods;

public class ReverseRightHalfPyramid {
    
    public static void ReverseRightHalfStarPyramid(int n){
        
        for(int i = n; i >= 1 ; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void ReverseRightHalfNumberPyramid(int n){
        
        for(int i = 1; i <= n ; i++){
            for(int j = n; j >= i; j--){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void ReverseRightHalfNumberFromFivePyramid(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print(i);
            }
            
            System.out.println();
        }

    }



    public static void ReverseRightHalfNumberOneTowThreeInColPyramid(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }

    }


    public static void ReverseRightHalfNumberOneTowThreeInRowPyramid(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i ; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }

    }


    public static void ReverseRightHalfNumberFiveFourThreeInRowPyramid(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i ; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }

    }


    public static void ReverseRightHalfPyramidCapitalChar1(int n){

        int count = 1;

        for(int i = n; i >= 1; i--){
            
            for(int j = i; j >= 1; j--){
                System.out.print((char) (count + 64));
                count++;
            }
            System.out.println();
        }

    }

    public static void ReverseRightHalfPyramidCapitalChar2(int n){

        int count = (n*(n+ 1))/2;

        for(int i = n; i >= 1; i--){
            
            for(int j = i; j >= 1; j--){
                System.out.print((char) (count + 64));
                count--;
            }
            System.out.println();
        }

    }
    public static void ReverseRightHalfPyramidCapitalChar3(int n){

        int count = 5;

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j >= 1; j--){
                System.out.print( (char) (c + 64));
                c--;
            }
            System.out.println();

            count += i -1;

        }

    }

    public static void ReverseRightHalfPyramidCapitalChar4(int n){

        int count = 11;

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j >= 1; j--){
                System.out.print((char)(c + 64));
                c++;
            }
            System.out.println();

            count -= i- 1;

        }

    }

    public static void ReverseRightHalfPyramidCapitalChar5(int n){

        int count = 11;

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j >= 1; j--){
                System.out.print((char)(c + 64));
                c++;
            }
            System.out.println();

            count -= i- 1;

        }

    }

    public static void ReverseRightHalfPyramidCapitalChar6(int n){

        int count = 1;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c += j;
            }
            System.out.println();

            count++;

        }

    }

    public static void ReverseRightHalfPyramidCapitalChar7(int n){

        int count = 5;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c += j-1;
            }
            System.out.println();
            count--;
        }
    }

    public static void ReverseRightHalfPyramidCapitalChar8(int n){

        int count = (n* (n+1)) / 2;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c -= j;
            }
            System.out.println();
            count--;
        }
    }
    public static void ReverseRightHalfPyramidCapitalChar9(int n){

        int count = 11;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c -= j - 1;
            }
            System.out.println();
            count++;
        }
    }

    public static void ReverseRightHalfPyramidCapitalChar10(int n){

        int count = 1;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c += j + 1;
            }
            System.out.println();
            count += i;
        }
    }

    public static void ReverseRightHalfPyramidCapitalChar11(int n){

        int count = 1;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c += j;
            }
            System.out.println();
            count += i+1;
        }
    }

    public static void ReverseRightHalfPyramidCapitalChar12(int n){

        int count = (n*(n+1))/2;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c -= j+1;
            }
            System.out.println();
            count -= i;
        }
    }

    public static void ReverseRightHalfPyramidCapitalChar13(int n){

        int count = (n*(n+1))/2;

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c -= j;
            }
            System.out.println();
            count -= i+1;
        }
    }




}
