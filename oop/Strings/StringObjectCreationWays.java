package oop.Strings;

public class StringObjectCreationWays {

    public static void main(String[] args){

        // ways of creation strings

        // using literal
        String s1 = "Hello";
//        System.out.println(s1);

        // using new keyword
        String s2 = new String("India");
//        System.out.println(s2);

        // char[]

//        char[] c =  {'I', 'n', 'd','i','a'};
//        System.out.println(c);

        // Anonymous
//        System.out.println("India");



        // Immutable String : means we can not change that string

        // Mutable String: means we can change that string
        // ways

        // 1. using StringBuffer
        StringBuffer sBuf = new StringBuffer(s1);
        sBuf.append(s2);
        System.out.println(sBuf);

        // 2. using StringBulider
        StringBuilder sBul = new StringBuilder(s2);
        sBul.append(s1);
        System.out.println(sBul);








    }

}
