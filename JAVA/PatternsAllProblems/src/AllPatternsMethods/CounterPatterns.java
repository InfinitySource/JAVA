package AllPatternsMethods;

public class CounterPatterns {
    

    public static void CounterOneToFifteen(int n){

        int count = 1;
        
        for(int i = 1; i <= n; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print(count + "\t");
            
                count++;
            }
            
            System.out.println();
        }

    }

    public static void CounterFifteenToOne(int n){

        int count = (n*(n + 1)) / 2;
        
        for(int i = 1; i <= n; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print(count + "\t");
                count--;
            }
            
            System.out.println();
        }

    }

    public static void CounterPattern3(int n){
        
        int count = 1; 

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c--;

            }

            System.out.println();
            count = count + (i + 1);
            
        }

    }

    public static void CounterPattern4(int n){
        
        int count = (n*(n+1)) / 2; 

        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c++;

            }

            System.out.println();
            
            count -= i + 1;
        }


    }

    public static void CounterPattern5(int n){
        
        int count = 1; 

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j-1;

            }

            System.out.println();
            
            count++;
        }


    }
    
    public static void CounterPattern6(int n){
        int count = 5;

        for(int i = n; i >= 1; i--){

            int c = count;

            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j;

            }
            System.out.println();
            count--;

        }

    }
   
    public static void CounterPattern7(int n){

        int count = (n*(n+1))/2;
        
        for(int i = n; i >= 1; i--){

            int c = count;

            for(int j = n ; j >= i ; j--){
                System.out.print(c + "\t");
                c -= j - 1;
            }
            
            System.out.println();

            count--;
        }

    }
    
    public static void CounterPattern8(int n){

        int count = 11;
        
        for(int i = n; i >= 1; i--){

            int c = count;

            for(int j = n ; j >= i ; j--){
                System.out.print(c + "\t");
                c -= j;
            }
            
            System.out.println();

            count++;
        }

    }

    public static void CounterPattern9(int n){
        
        int count = 1; 

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j;

            }

            System.out.println();            
            count += i;
            
        }

    }

    public static void CounterPattern10(int n){
        
        int count = 5; 

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j + 1;

            }

            System.out.println();            
            count += i - 1;
            
        }

    }

    public static void CounterPattern11(int n){
        
        int count = 11; 

        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                
                c += j + 1;

            }

            System.out.println();            
            count -= i - 1;
            
        }

    }

    public static void CounterPattern12(int n){
        int count = (n*(n+1))/2; 
        
        for(int i = n; i >= 1; i--){
            int c = count;
           
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j;
            }
            
            System.out.println();            
            count -= i;
        }

    }

    public static void CounterPattern13(int n){
        
        int count = 1;
        for(int i = n; i >= 1; i--){
            int c = count;
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c++;
            }
            
            System.out.println();
            count += i;
        }

    }
    
    public static void CounterPattern14(int n){
        
        int count = (n*(n+1)) /2;
        for(int i = n; i >= 1; i--){
            int c = count;
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c--;
            }
            
            System.out.println();
            count -= i;
        }


    }
    
    public static void CounterPattern15(int n){
        
        int count = 5;
        for(int i = n; i >= 1; i--){
            int c = count;
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c--;
            }
            
            System.out.println();
            count += i - 1;
        }


    }

    public static void CounterPattern16(int n){
        
        int count = 11;
        for(int i = n; i >= 1; i--){
            int c = count;
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c++;
            }
            
            System.out.println();
            count -= i - 1;
        }
    }

    public static void CounterPattern17(int n){
        
        int count = 1;
        for(int i = 1; i <= n; i++){
            int c = count;
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j;
            }
            
            System.out.println();
            count++;
        }
    }

    public static void CounterPattern18(int n){
        
        int count = 5;
        for(int i = 1; i <= n; i++){
            int c = count;
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j - 1;
            }
            
            System.out.println();
            count--;
        }
    }

    public static void CounterPattern19(int n){
        
        int count = 11;
        for(int i = 1; i <= n ;i++){
            int c = count;
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j - 1;
            }
            System.out.println();
            count++;
        }
    }

    public static void CounterPattern20(int n){
        
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n ;i++){
            int c = count;
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j;
            }
            System.out.println();
            count--;
        }
    }
    
    public static void CounterPattern21(int n){
        
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n ;i++){
            int c = count;
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j+1;
            }
            System.out.println();
            count -= i;
        }
    }
    
    public static void CounterPattern22(int n){
        
        int count = 1;
        for(int i = 1; i <= n ;i++){
            int c = count;
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j+1;
            }
            System.out.println();
            count += i;
        }
    }
    
    public static void CounterPattern23(int n){
        
        int count = 1;
        for(int i = 1; i <= n ;i++){
            int c = count;
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j;
            }
            System.out.println();
            count += i+1;
        }
    }


   // Reverse Left Half Pyramid

   public static void CounterPatternReverseLeftStar(int n){
    
    
        for(int i = 1; i <= n; i++){
        
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }

            System.out.println();
        }
   }
   
   public static void CounterPattern24(int n){
    
        int count = 1;
    
        for(int i = n; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(count + "\t");
                count++;
            }

            System.out.println();
        }
   }
  
   public static void CounterPattern25(int n){
    
        int count = (n*(n+1))/2;
    
        for(int i = n; i >= 1; i--){

            for(int j = i; j < n; j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(count + "\t");
                count--;
            }

            System.out.println();
        }
   }
   
   public static void CounterPattern26(int n){
    
        int count = 5;
    
        for(int i = n; i >= 1; i--){

            int c = count;

            for(int j = i; j < n; j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c--;
            }

            System.out.println();
            count += i-1;
        }
   }
   
   public static void CounterPattern27(int n){
    
        int count = 11;
    
        for(int i = n; i >= 1; i--){

            int c = count;

            for(int j = i; j < n; j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c++;
            }

            System.out.println();
            count -= i - 1;
        }
   }
   
   public static void CounterPattern28(int n){
    
        int count = 1;
    
        for(int i = 1; i <= n; i++){

            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j;
            }
            
            System.out.println();
            count++;
        }
   }

   public static void CounterPattern29(int n){
        int count = (n* (n+1))/2;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }

            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j;
            }

            System.out.println();
            count--;
        }
   }

   public static void CounterPattern30(int n){
        int count = 11;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }

            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j -1;
            }

            System.out.println();
            count++;
        }
   }

   public static void CounterPattern31(int n){
        int count = 1;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j;
            }

            System.out.println();
            count += i + 1;
        }
   }
   
   public static void CounterPattern32(int n){
        int count = 1;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j+1;
            }

            System.out.println();
            count += i;
        }
   }
   
   public static void CounterPattern33(int n){
        int count = (n*(n+1)) / 2;
        
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j > 1; j--){
                System.out.print("\t");
            }

            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j+1;
            }

            System.out.println();
            count -= i;
        }
   }
   

   // Left Half Pyramid Number
   

   public static void CounterPatternLeftStar(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j < n;j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }

            System.out.println();
        }

   }

   public static void CounterPattern34(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){

            for(int j = i; j < n;j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(count + "\t");
                count++;
            }

            System.out.println();
        }

   }

   public static void CounterPattern35(int n){
        int count = (n*(n+1))/2;
        for(int i = 1; i <= n; i++){
            
            int c = count;

            for(int j = i; j < n;j++){
                System.out.print("\t");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(c + "\t");
                c++;
            }

            System.out.println();
            count -= i+1;
        }
   }

   public static void CounterPattern36(int n){
        int count = 1;
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j -1;
            }

            System.out.println();
            count++;
        }
   }

   public static void CounterPattern37(int n){
        
        int count = 5;
        for(int i = n; i >= 1; i--){
            
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c += j;
            }

            System.out.println();
            count--;
        }
   }

   public static void CounterPattern38(int n){
        int count = 11;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j;
            }

            System.out.println();
            count++;
        }
   }

   public static void CounterPattern39(int n){
        int count = (n*(n+1))/2;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = n; j >= i; j--){
                System.out.print(c + "\t");
                c -= j - 1;
            }

            System.out.println();
            count--;
        }
   }
   public static void CounterPattern40(int n){
        int count = 11;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j + 1;
            } 

            System.out.println();
            count -= i - 1;
        }
   }

   public static void CounterPattern41(int n){
        int count = (n* (n+1)) /2;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c += j;
            } 

            System.out.println();
            count -= i;
        }
   }


   public static void CounterPattern42(int n){
        int count = 5;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j + 1;
            } 

            System.out.println();
            count += i - 1; 
        }
   }

   public static void CounterPattern43(int n){
        int count = 1;
        
        for(int i = n; i >= 1; i--){
            int c = count;

            for(int j = i; j > 1;j--){
                System.out.print("\t");
            }
            for(int j = i; j <= n; j++){
                System.out.print(c + "\t");
                c -= j;
            } 

            System.out.println();
            count += i; 
        }
   }
   
   



}
