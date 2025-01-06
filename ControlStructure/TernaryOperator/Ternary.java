package TernaryOperator;


public class Ternary{
    // public static void main(String[] args) {   
    //     IfelseForAB(10, 20);
    // }

    public static void TrenaryForAB(int a,int b){
        
        String result = (a > b) ? "a is bigger": "a is bigger";

        System.out.println(result);
    }

    public static void TrenaryForABC(int a,int b,int c){
        
        String result = (a > b) ? (a > c) ? "a is bigger" : "c is bigger" : (b > c) ? "b is bigger": "c is bigger";

        System.out.println(result);
    }

    public static void TrenaryForABCD(int a,int b,int c, int d){

        String res = (a > b)? (a > c )? (a > d) ? "a is bigger" : "s is bigger" : (c > d)? "c is bigger" : "d is bigger" : (b > c) ? (b > d) ? "b is bigger" : "d is bigger" : (c > d) ? "c is bigger" : "d is bigger";  
        
        System.out.println(res);

    }
    public static void TrenaryForABCDE(int a,int b,int c, int d,int e){

        String res = (a > b )? (a > c) ? (a > d) ? (a > e)? "a is bigger" : "e is bigger" : (d > e) ? "d is bigger" : "e is bigger": (c > d) ? (c > e) ? "c is bigger" : "e is bigger" : (d > e) ? "d is bigger" : "e is bigger" : (b > c)? (b > d)? (b > e)? "b is bigger" : "e is bigger" : (d > e)? "d is bigger" : "e is bigger" : (c > d) ? "c is bigger" : "d is bigger";
        
        System.out.println(res);

    }

    // public static void TrenaryForABCDE(int a,int b,int c,int d,int e){
        
    //     String res = (a >b)?(a>c)?(a>d)?(a>e) ? "a":"e" : (d > e)? "d":"e" : (c > d)?(c > e)?"c":"e":(d > e)? "d" : "e" : (b > c) ? (b > d) ? (b > e)? "b": "e" :(d > e)? "d":"e" : (c > d) ? (c > e)? "c" : "e": (d > e)? "d" : "e";

    //     System.out.print(res);
    
    // }


    
    
}