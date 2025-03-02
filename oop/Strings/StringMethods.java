package oop.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = " H  ell  o  ";
        String s3 = "Hello";
        String s4 = "HelloWorld";


        System.out.println(s1.length()); // 5
        System.out.println(s1.charAt(0)); // H
        System.out.println(s1.substring(2)); // llo
        System.out.println(s1.substring(1,4)); // ell
        System.out.println(s1.indexOf('l')); // 2
        System.out.println(s1.lastIndexOf('l')); // 3
        System.out.println(s1.toLowerCase()); // hello
        System.out.println(s1.toUpperCase()); // HELLO
        System.out.println(s2.trim()); // "Hello"
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // false
        System.out.println(s1.contains("l")); // true
        System.out.println(s2.contains(" ")); // true
        System.out.println(s3.contains("H")); // true
        System.out.println(s1.startsWith("H")); // true
        System.out.println(s1.startsWith("l")); // false
        System.out.println(s1.endsWith("o"));  // true
        System.out.println(s1.replace("l" , "i")); // Heiio
        System.out.println(s1.replaceAll("l", "o"));  // Heooo
        System.out.println(s1.split(" "));
        System.out.println(s1.join("," , "Hello" , " world"));
        System.out.println(s1.valueOf(123));
        System.out.println(s1.isEmpty()); // false
        System.out.println(String.format("Hello %s", "World"));
        System.out.println(s1.compareTo(s2)); // 40
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareToIgnoreCase(s2)); // 72
        char[] sArr = s1.toCharArray();
        System.out.println(Arrays.toString(sArr));
        System.out.println(s1.repeat(5));
    }

}
