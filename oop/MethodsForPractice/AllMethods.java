package oop.MethodsForPractice;

public class AllMethods {


    public int findLastNumber(int n){
        return n % 10;
    }


    public int findSecondLastNumber(int n){
        return (n/10) % 10;
    }


    public int findfirstNumber(int n){

        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public int findSecondDigitOfNumber(int n){
        while(n >= 100){
            n /= 10;
        }
        return n % 10;
    }

    public int findSumOfAllNumber(int n){
        int sum = 0;

        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public double findAvgOfDigits(int n){
       int count = 0;
       int sum = 0;
       while (n != 0) {
        sum = sum + n%10;
        count++;
        n = n/10;

       }
       return sum / count;
    }

    public int shiftFirstToLast(int n){
        int length = 1;
        int temp = n;

        while (temp >= 10) {
            length *= 10;
            temp /= 10;

        }
        n %= length;
        n *= 10;
        n += temp;
        return n;
    }

    public int placeLastNoToFirst(int n){
        
        int lastNumber = n % 10;
        int remainNumber = n / 10;
        int length = 1;

        while (n > 10) {
            length = length * 10;
            n = n / 10;
        }

        lastNumber = lastNumber * length;
        lastNumber = lastNumber + remainNumber;

        return lastNumber;

    }

    public int placeFirstToLast(int n){
        
        int sum = 0;
        int temp = n;

        while(temp != 0){

            sum = sum + temp%10;
            temp /= 10; 
        }

        if(sum < 10){
            n *= 10;
        }else{
            n *=100;
        }

        return n + sum;

    }



    public int ReverseNumber(int n){
        
        // int sum = 0;
        // while (n != 0) {
            
        //     sum *= 10;
        //     sum += n%10;
        //     n = n/10;

        // }
        // return sum;

        int revNum = 0;

        while(n != 0){
            int lastNum = n % 10;
            revNum = revNum*10 + lastNum;
            n = n/10;   
        }
        return revNum;

    }
    
    public boolean palindromeNumber(int n){
        
        return (ReverseNumber(n) == n) ? true : false;

    }

    public int nthPalindromeNumber(int n){
        
        int count = 0;
        int a = 0;
        while(true){    
            if(palindromeNumber(a)){
                count++;
            }
            if(count == n){
                break;
            }
            a++;
        }
        return a;

    }
     
    public boolean primeOrNot(int n){

        boolean isPrime = true;

        if(n == 1){
            // return "Not Prime Number";
            return false;
        }
        
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            // return "Prime Number";
            return true;
        }else{
            // return "Not Prime Number";
            return false;
        }

    }

    public boolean StrongOrNotStrongNumber(int n){
        
        int temp = n;
        
        int sum = 0;
        int factor = 1;
        int factorSum = 0;
        while (temp != 0) {
            int lastNum = temp %10;

            for(int i = lastNum; i > 0; i--){
                factorSum = factor * i;
            }

            sum = sum + factorSum;
            temp = temp / 10;
        }

        boolean result = (sum == n)? true : false;
       
        return result;

    }

    
    boolean checkPalinPrime(int n){
        
        boolean primeCheck = primeOrNot(n);
        boolean palindromeCheck = palindromeNumber(n);

        if(palindromeCheck && primeCheck){
            return true;
        }else{
            return false;
        }
    }


    public boolean checkPerfectSquare(int n){

        boolean flag = false;

        if( Math.sqrt(n) % 1 == 0){
            return !flag;
        }
        return flag;

    }

    public boolean checkPerfectCube(int n){

        boolean flag = false;

        if(Math.cbrt(n) % 1 == 0){
            return !flag;
        }
        return flag;

    }

    public boolean checkPalindromePrime(int n){

        boolean flag = false;
        boolean checkPrime = primeOrNot(n);
        boolean checkPalindrome = palindromeNumber(n);

        if(checkPrime && checkPalindrome){
            return !flag;
        }
        return flag;

    }




}
