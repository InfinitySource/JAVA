package OOP.MethodsForPractice;

public class AllMethods {


    public int findLastNumber(int n){
        return n % 10;
    }


    public int findSecondLastNumber(int n){



        while (n >= 100) {
            n = n % 100;
        }
        return n;
    }

    public int findfirstNumber(int n){

        while (n > 1) {
            n = n / 10;
        }
        return n;
    }

    // public int place(int n){
        
    //     int lastNumber = n % 10;
    //     int remainNumber = n / 10;
    //     int length = 1;

    //     while (n > 10) {
    //         length = length * 10;
    //         n = n / 10;
    //     }

    //     lastNumber = lastNumber * length;
    //     lastNumber = lastNumber + remainNumber;

    //     return lastNumber;

    // }

    
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

    // public int addSumtoLast(int n){
        
    //     int sum = 0;
    //     int temp = n;
    //     int length = 1;


    //     while (n != 0) {

    //         int lastNum = n % 10;
    //         sum += lastNum;

    //         n /= 10;
    //     }
    //     int updatedSum = sum;
    //     // int addZero = 1;
    //     while (temp > 1) {
    //         length = length * 10;
    //         temp = temp / 10;
    //     }

    //     int res = n + sum;


    //     return sum ;

    // }

}
