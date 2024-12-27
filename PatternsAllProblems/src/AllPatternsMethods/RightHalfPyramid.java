package AllPatternsMethods;

public abstract class RightHalfPyramid{
    
    public static void RightHalfStarPyramid(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

   
    

    public static void RightHalfNumberOneToFivePyramid(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();

        }

    }
    public static void RightHalfNumberFiveToOnePyramid(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = n; col >= row; col--){
                System.out.print(row);
            }
            System.out.println();

        }

    }
    public static void RightHalfNumberOneOneTwoPyramid(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();

        }

    }


    public static void RightHalfNumberFiveFiveFourPyramid(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = n; col >= row; col--){
                System.out.print(col);
            }
            System.out.println();

        }

    }

    public static void RightHalfNumberFiveFourFivePyramid(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = row; col <= n; col++){
                System.out.print(col);
            }
            System.out.println();

        }

    }

    public static void RightHalfCapitalLetterPyramid(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print((char)(row + 64));
            }
            System.out.println();

        }

    }

    public static void RightHalfCapitalLetterAABPyramid(int n){
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print((char)(col + 64));
            }
            System.out.println();

        }

    }

    public static void RightHalfSmallLetterEDDPyramid(int n){
    
        for(int i = n; i >= 1; i--){
            
           for(int j = n ; j >= i; j--){
            System.out.print((char)(i + 96));
           }
           
            System.out.println();
        }
       
    }




    public static void RightHalfSmallLetterEDEPyramid(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = row; col <= n; col++){
                System.out.print((char)(col + 96));
            }
            System.out.println();

        }

    }
    public static void RightHalfCapitalLetterEEDPyramid(int n){
        
        for(int row = n; row >= 1; row--){
            for(int col = n; col >= row; col--){
                System.out.print((char)(col + 64));
            }
            System.out.println();

        }

    }
     
    
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




    public static void SpaceProb(int n){
        
        // for(int i = 1; i <= n; i++){

        //     for(int j = i; j < n ; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i ; j >= 1 ; j--){
        //         System.out.print("*");
        //     }
            

        //     System.out.println();
        // }

        // int i = 1;

        // 5 > 1
        // 4 > 1
        // 3 > 1
        // 2 > 1
        // 1 > 1  F

        while(n >= 1){

            System.out.println(n);
            n = n - 1;
        }
        

    }


    

    // public static void OneTwoThree(int n){
        
    //     for(int i = n; i >= 1; i--){
            
    //         for(int j = n; j > i; j--){
    //             System.out.print(" ");
    //         }
    //         for(int j = 1; j <= i; j++){
    //             System.out.print(j);
    //         }
            
    //         System.out.println();


    //     }

    // }
 
    // 5
    // 9    4
    // 12   8   3
    // 14   11  7   2
    // 15   13  10  6  1
 


 
    // public static void OneTwoThree(int n){
               
    //            int count = n ;
               
    //            for(int i = n; i >= 1; i--){
                   
    //             int c = count; 
                   
    //                for(int j = i ; j <= n; j++){
    //                    System.out.print(c + " ");
    //                 //    c = c + j + 1; 
    //                    c -=j + 1; 
    //                }
                   
    //                System.out.println();
    //             //    count = count - i - 1 ;  
    //                count += i - 1 ; 

                  
    //            }
               
    //         }

            
    public static void OneTwoThree(int n){
        
        int count = (n* (n+ 1)) / 2;

        for( int i = n ; i >= 1; i--){
            int c = count;
            
            for(int j = i; j >= 1;j--){

                System.out.print(c + " ");
                c--;

            }
            
            System.out.println();
            count++;
        }

    }

    
    


    

}