package If_else_nested_if_else;
public class Program2 {
    
    public static void main(String[] args) {
     
        int a = 10, b = 20, c = 30, d = 40;
    
        // if(a > b){
        //     if(a > c){
        //         if(a > d){
        //             System.out.println("a is bigger");
        //         }else{
        //             System.out.println("d is bigger");
        //         }
        //     }else{
        //         if(c > d){
        //             System.out.println("c is bigger");
        //         }else{
        //             System.out.println("d is bigger");
        //         }
        //     }
        // }else{
        //     if(c > a){
        //         if(c > b){
        //             System.out.println("c is bigger");
        //         }else{
        //             System.out.println("b is bigger");
        //         }
        //     }else{
        //         if(d > a){
        //             System.out.println("d is bigger");
        //         }else{
        //             System.out.println("a is bigger");
        //         }
        //     }
        // }



        if (a >= b) { // Check if a is greater than or equal to b
            if (a >= c) { // Check if a is greater than or equal to c
                if (a >= d) { // Check if a is greater than or equal to d
                    System.out.println(a + " is bigger");
                } else {
                    System.out.println(d + " is bigger");
                }
            } else { // a is less than c
                if (c >= d) { // Check if c is greater than or equal to d
                    System.out.println(c + " is bigger");
                } else {
                    System.out.println(d + " is bigger");
                }
            }
        } else { // a is less than b
            if (b >= c) { // Check if b is greater than or equal to c
                if (b >= d) { // Check if b is greater than or equal to d
                    System.out.println(b + " is bigger");
                } else {
                    System.out.println(d + " is bigger");
                }
            } else { // b is less than c
                if (c >= d) { // Check if c is greater than or equal to d
                    System.out.println(c + " is bigger");
                } else {
                    System.out.println(d + " is bigger");
                }
            }
        }
        

    }
}



      

        
