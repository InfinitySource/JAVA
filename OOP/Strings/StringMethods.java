package OOP.Strings;

public class StringMethods {
    public static void main(String[] args){
        String s1 = "India";
        String s2 = "Hello";

        // find  length of string
//        findLengthMethod(s1, s2);

        // use charAt() - find char at which place it located
//        charAtMethod(s1);

        // get subString from String
//        subStringMethod(s1, s2);

        // concatenates string at the end of that String
//        concatMethod(s1,s2);

        // find an indexOf character
//        indexOfMethod(s1,s2);

        // find string indexOf at after specific index
//        indexOfSpecificIndexStartFromMethod(s1,s2);


        lastIndexOfString(s1,s2);


    }


    public static void charAtMethod(String s){
        System.out.println(s.charAt(2)); // d
        System.out.println(s.charAt(0)); // I
        // System.out.println(s.charAt(5)); // StringIndexOutOfBoundException
    }

    public static void findLengthMethod(String s1, String s2){
        System.out.println(s1.length());
        System.out.println(s2.length());
    }

    public static void subStringMethod(String s1, String s2){
        System.out.println(s1.substring(1)); // ndia
        System.out.println(s2.substring(3)); // lo
    }

    public static void concatMethod(String s1, String s2){
        System.out.println(s1.concat(s2)); // IndiaHello
        System.out.println(s2.concat(s1)); // HelloIndia
    }

    public static void indexOfMethod(String s1, String s2){
        System.out.println(s1.indexOf("i")); // 3
        System.out.println(s1.indexOf("l")); // if not present in string print -1
        System.out.println(s2.indexOf("o")); // 4
        System.out.println(s2.indexOf("I")); // if not present in string print -1
    }

    public static void indexOfSpecificIndexStartFromMethod(String s1, String s2){
        System.out.println(s1.indexOf("i", 2)); // 3
        System.out.println(s1.indexOf("l", 1)); // if not present in string print -1
        System.out.println(s2.indexOf("o", 6)); // -1
        System.out.println(s2.indexOf("e", 1)); // if not present in string print -1
    }


    public static void lastIndexOfString(String s1, String s2){
        System.out.println(s1.lastIndexOf("I")); // 0
        System.out.println(s2.lastIndexOf("l")); // 3
    }


}
