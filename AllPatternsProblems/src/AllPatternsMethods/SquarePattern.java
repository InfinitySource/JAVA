package AllPatternsMethods;

public class SquarePattern{
    
    public static void SquareStar(int size){
        for(int row=1; row <=size ; row++){
            for(int col=1; col <= size ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void SquareDash(int n){
        
        for(int row=1; row <=n ; row++){
            for(int col=1; col <= n ; col++){
                System.out.print("_ ");
            }
            System.out.println();
        }
        
    }

    public static void SquareNumber(int n){
        
        for(int row = 1; row <=n ; row++){
            for(int col = 1; col <= n; col++){
                System.out.print(row+ " ");
            }
            System.out.println();
        }
        
    }

    // public static void SquareNumberReverse(int n){
        
    //     for(int row = n; row >= 1; row--){
    //         for(int col = 1 ; col <= n ; col++){
    //             System.out.print(row + " ");
    //         }
    //         System.out.println();
    //     }
        
    // }
    public static void SquareNumberReverse(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = 1 ; col <= n ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
        
    }

    public static void SquareOneToFiveInCol(int n){
        
        for( int row = 1;row <= n ;row++ ){
            for(int col = 1; col <= n; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
        
    }

    public static void SquareFiveToOneInCol(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = n ; col >= 1; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
    }

    // AAAAA
    // BBBBB
    // CCCCC
    // DDDDD
    // EEEEE
    public static void SquareCapitalLetterInCol(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1 ; col <= n; col++){
                System.out.print((char)(row+64));
            }
            System.out.println();
        }
        
    }


    public static void SquareReverseCapitalLetterInCol(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = n ; col >= 1; col--){
                System.out.print((char)(row+64));
            }
            System.out.println();
        }
        
    }
    public static void SquareSmallaTobLetterInCol(int n){
        
        for(int row = 1; row <= n; row++){
         for(int col = 1; col <= n; col++){
            System.out.print((char)(col+96));
         }
            System.out.println();
        }
        
    }

    public static void SquareSmallLastToFirstLetterInCol(int n){
        
        for(int row = 1; row <= n; row++){
         for(int col = n; col >= 1; col--){
            System.out.print((char)(col+96));
         }
            System.out.println();
        }
        
    }
}