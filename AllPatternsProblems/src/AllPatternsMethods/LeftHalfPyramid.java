package AllPatternsMethods;

public class LeftHalfPyramid {
    
    // public static void LeftHalfStarPyramid(int n){
    //     for(int row = 1; row <= n ; row++){

    //         for(int col = row; col < n; col++){
    //             System.out.print(" ");
    //         }
    //         for(int col = row; col >= 1; col--){
    //             System.out.print("* ");
    //         }
    //         System.out.println();

    //     }
    // }

    
    // public static void LeftHalfStarPyramid(int n){
    //    for(int i = 1 ;i <= n;i++){
       
    //     for(int j = i; j < n; j++){
    //         System.out.print("_");
    //     }
    //     for(int j = i; j >= 1; j--){  // 1 >= 5
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }
    // }


    public static void LeftHalfStarPyramid(int n){
       for(int i = 1 ;i <= n;i++){

        for(int j = i; j <= n; j++){
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    
    
    public static void ReverseLeftHalfStarPyramid(int n){
       for(int i = n ;i >= 1;i--){

        for(int j = i; j <= n; j++){
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--){
            System.out.print("*");
        }
        System.out.println();
       }
    }



    // Left Half Pyramid Capital Char

    public static void LeftHalfPyramidCapitalChar1(int n){

        int count = 1;
        
        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n ; j++){
                System.out.print((char)(count + 64));
                count++;
            }
            System.out.println();
        }
    }


    public static void LeftHalfPyramidCapitalChar2(int n){

        int count = (n*(n+1))/2;
        
        for(int i = n; i >= 1; i--){

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n ; j++){
                System.out.print((char)(count + 64));
                count--;
            }
            System.out.println();
        }
    }
    
    public static void LeftHalfPyramidCapitalChar3(int n){

        int count = 1;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print((char)(c + 64));
                c--;
            }
            System.out.println();
            count+= i+1;
        }
    }
    
    public static void LeftHalfPyramidCapitalChar4(int n){

        int count = (n*(n+1))/2;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print((char)(c + 64));
                c++;
            }
            System.out.println();
            count -= i+1;
        }
    }


    public static void LeftHalfPyramidCapitalChar5(int n){

        int count = 1;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c += j - 1;
            }
            System.out.println();
            count++;
        }
    }

    public static void LeftHalfPyramidCapitalChar6(int n){

        int count = 5;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c += j;
            }
            System.out.println();
            count--;
        }
    }

    public static void LeftHalfPyramidCapitalChar7(int n){

        int count = 11;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c -= j;
            }
            System.out.println();
            count++;
        }
    }

    public static void LeftHalfPyramidCapitalChar8(int n){

        int count = (n* (n+ 1))/2;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print((char)(c + 64));
                c -=j-1;
            }
            System.out.println();
            count--;
        }
    }

    public static void LeftHalfPyramidCapitalChar9(int n){

        int count = 11;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c += j+1;
            }
            System.out.println();
            count -= i -1;
        }
    }

    public static void LeftHalfPyramidCapitalChar10(int n){

        int count = (n*(n+1))/2;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c += j;
            }
            System.out.println();
            count -= i;
        }
    }

    public static void LeftHalfPyramidCapitalChar11(int n){

        int count = 5;
        
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print((char)(c + 64));
                c -= j + 1;
            }
            System.out.println();
            count += i-1;
        }
    }
    
   


}
