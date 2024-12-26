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


}
