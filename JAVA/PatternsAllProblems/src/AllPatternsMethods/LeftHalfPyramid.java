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

   


}
