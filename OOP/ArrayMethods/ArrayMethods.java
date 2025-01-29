package OOP.ArrayMethods;

import java.util.HashMap;
import java.util.Map;

public class ArrayMethods {
    
    // WAP to find avg of odd elements from array
    public static int avgOfOddElement(int[] arr){
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum = sum + arr[i];
                count++;
            }
        }
        int avg = sum / count;
        return avg;
    }

    // WAP to find an avg of odd and even element from an array
    
    public static Map<String,Integer> avgOfOddAndEvenElement(int[] arr){
        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum1 += arr[i];
                count1++;
            }
            if(arr[i] % 2 != 0){
                sum2 += arr[i];
                count2++;
            }
        }

        int avgEven = sum1 / count1;
        int avgOdd = sum2 / count2;

        Map<String, Integer> average = new HashMap<>();
        average.put("Average of Even", avgEven);
        average.put("Average of Odd", avgOdd);
        
        return average;
    }


    // WAP to display greater element than avg of array

    public static void greaterNumThanAvg(int[] arr){
       
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];  
        }
        
        double avg = sum / arr.length;
        
        System.out.println("Average: " + avg);

        for(int num : arr){
            if(num > avg){
                System.out.println("Greater number is :" + num);
                return;
            }
        }
        System.out.println("No element is greater than the average.");
    }


    // WAP to replace Odd element with their first digit of element
    
    public static void replaceOddEleWithFirstDigit(int[] arr){
        
        for(int i = 0; i <arr.length; i++){
            
            if(arr[i] % 2 != 0){  
                int num = arr[i];
                while(num >= 10){
                    num = num / 10;
                }
                arr[i] = num;    
            }

        }

        System.out.print("Modified Array: ");
        for(int num : arr){
           System.out.print(num + " ");
        }

    }


    // WAP to replace even element with their sum of digits

    public static void replaceEvenWithSumOfThatDigit(int[] arr){

        // int sum = 0;

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

