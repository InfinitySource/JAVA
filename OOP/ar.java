package OOP;

public class ar{
    public static void main(String[] args) {

        int[] arr = {29,34,56,43};
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
               
                int val = arr[i];
                int sum = 0;

                while(val != 0){
                    int lastNum = val % 10;
                    sum = sum + lastNum;
                    val = val / 10; 
                }
                arr[i] = sum;

                
            }
        }

        System.out.print("Modified Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
    
        
}



