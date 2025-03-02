package oop.ArraysInJava;

import java.util.Arrays;
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

    // WAP to shift first element to last in array

    public static void shiftFirstToLast(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {20, 30, 40, 50, 10}

        int first = arr[0];

        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = first;
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    // WAP to shift last element to first in array

    public static void shiftLastToFirst(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {50, 10, 20, 30, 40}

        int last = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = last;
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }



    // WAP to swap number last to first and first to last  in array

    public static void swapNumberLastToFirst(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {50, 10, 20, 30, 40}

        // int last = arr[arr.length - 1];

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }


    // WAP to swap number last to first and first to last without using 3rd variable in array

    public static void swapNumberLastToFirstWithoutThirdVar(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {50, 10, 20, 30, 40}

        
            arr[0] = arr[0] + arr[arr.length - 1];
            arr[arr.length - 1] =  arr[0] - arr[arr.length - 1];
            arr[0] = arr[0] - arr[arr.length - 1];
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }



    // WAP to shift first to last without using 3rd variable in array

    public static void shiftFirstToLastWithoutThirdVar(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {20, 30, 40, 50, 10}

        for(int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i] + arr[i+1];
            arr[i + 1] = arr[i] - arr[i + 1];
            arr[i] = arr[i] - arr[i + 1]; 

        }
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }



    // WAP to shift last to first without using 3rd variable in array


    public static void shiftLastToFirstWithoutThirdVar(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {50, 10, 20, 30, 40}

        for(int i = arr.length-1; i > 0; i--) {
            
            arr[i] = arr[i] + arr[i-1];
            arr[i-1] = arr[i] - arr[i - 1];
            arr[i] = arr[i] - arr[i - 1];

        }
        
        System.out.print("Modifited Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverseArrayWithoutThirdVar(int[] arr){
        // arr = {10 ,20, 30, 40, 50}
        // arr = {50 ,40 ,30, 20, 10}

        for(int i = 0; i < arr.length/2; i++) {

            arr[i] = arr[i] + arr[arr.length - i-1];
            arr[arr.length - i -1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
            
        }
        
        System.out.print("Modifited Array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void findMaxInArr(int[] arr){
        
    }

    public static void findSecondMaxInArr(int[] arr){
        
    }
    public static void findSumOfElementSameAsTarget(int[] arr){
        int target = 45;
        for(int i =0; i < arr.length;i++){
            for(int j = i+1; j < arr.length; j++){
                if(target == arr[i] + arr[j]){
                    System.out.println(arr[i] + "\t" + arr[j]);
                }
            }    
        }
    }
    public static void findSumOfThreeEleEqualsToTarget(int[] arr){
        int target = 70;

    }


    public static void mergeTwoArrInOneByOne(int[] a, int[] b){

        int len = a.length + b.length;
        int smallLen = (a.length > b.length)? b.length : a.length;
        int bigArr = (a.length > b.length)? a.length : b.length;
        int remain = bigArr - smallLen;

        int[] c = new int[len];
        
            for(int i = 0;i <= smallLen;i++){
                for(int j = i+1;j <= smallLen;j++){
                        c[i+i] = a[i];
                        c[j+j-1] = b[i];


                }
            } 

            // System.out.println(a[a.length]);
            for(int i=bigArr; i > smallLen; i--){
                if(a.length > b.length){
                    c[len-i] = a[i-1]; 
                    System.out.println(a[i-1]);
                }else if(b.length > a.length){
                    c[c.length-1] = b[i-1]; 
                    System.out.println(b[i-1]);
                }
            }
        System.out.println(Arrays.toString(c));

    }

    public static void toFixAnArray(int[] arr){
        
        int sum = 0;
        double avg = 0;
        int result = 0;
        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
        }
        avg = sum /arr.length;
       
        if(sum % arr.length == 0){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < avg){
                    int num = (int)avg - arr[i];
                    result += num;
                }
            }
        }else if(sum % arr.length != 0){
            result = -1;
        }
        System.out.println(result);

    }






    // String







}

