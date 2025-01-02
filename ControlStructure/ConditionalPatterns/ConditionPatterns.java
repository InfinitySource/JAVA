package ConditionalPatterns;

public class ConditionPatterns {
    
    // public static void main(String[] args) {
        
        
        

    // }


    // 12345
    // 12344
    // 12333
    // 12222
    // 11111
    
    public static void ConditionQueHW(int n){
        
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){

                if(j > n - i){

                    int lastN = j - (n - i);
                    
                    System.out.print(j - lastN);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
    



    public static void ConditionQue1(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n; j++){

                if(i < j) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }

    }

    public static void ConditionQue2(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(i < j) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }

    }

    public static void ConditionQue3(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){

                if(i < j) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }

    }


    public static void ConditionQue4(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = n; j >= 1; j--){

                if(i < j) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }

    }

    public static void ConditionQue5(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){

                if(i < j) {
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }

            }
            System.out.println();
        }

    }

    public static void ConditionQue6(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = n; j >= 1; j--){

                if(i < j) {
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }

            }
            System.out.println();
        }

    }

    public static void ConditionQue7(int n){
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n; j++){

                if(i < j) {
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }

            }
            System.out.println();
        }

    }


    public static void ConditionQue8(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(i < j) {
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }

            }
            System.out.println();
        }

    }



    





}
