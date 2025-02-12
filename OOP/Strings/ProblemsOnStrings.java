package OOP.Strings;

import OOP.ArraysInJava.ArrayMethods;

import java.util.Arrays;
import java.util.Locale;

public class ProblemsOnStrings {


    // same example in 4 different ways
    // input : India
    // output : ndiaI


    //1.
    public static void usingLoopFirstToLast(){
        String s1 = "India";
        String s2 = "";
        for(int i = 1; i < s1.length(); i++){
            s2 += s1.charAt(i);
        }
        s2 += s1.charAt(0);
        System.out.println(s2);
    }



    // 2.
    public static void usingStringBuilder(){
        String s1 = "India";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s1.length();i++){
            sb.append(s1.charAt(i));
        }
        sb.append(s1.charAt(0));
        System.out.println(sb);

    }

    //3.
    public static void usingStringBuilderAndSubstring(){
        String s1 = "India";
        StringBuilder sb = new StringBuilder(s1.substring(1));
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }

    // 4.
//    public static void usingStringBuilderAndLength(){
//        String s1 = "India";
//        StringBuilder sb = new StringBuilder(s1);
//        char c = sb.charAt();
//    }


    // WAP to swap first and last char from string:
    public static void swapFirstToLastChar(){
        String s1 = "India";
//        StringBuilder sb = new StringBuilder();
//        sb.append(s1.charAt(s1.length() - 1));
//        sb.append(s1.substring(1,s1.length() - 1));
//        sb.append(s1.charAt(0));
//        System.out.println(sb);

        //        OR

        StringBuilder sb = new StringBuilder(s1);
       char c = sb.charAt(sb.length() -1);
       sb.insert(0,c);
       sb.deleteCharAt(sb.length() - 1);
       c = sb.charAt(1);
       sb.deleteCharAt(1);
       sb.append(c);
       System.out.println(sb);

    }


    // WAP to add number of count in reverse order in between each element
    // input : International
    // output: : I13n12t1e10r9n8a7t6i5o4n3a2l1

    public static void countReverseOrderInBetweenEachEle(){

        String s1 = "International";
        StringBuilder sb = new StringBuilder(s1);
        int count = 1;
        for(int i =sb.length() -1; i >= 0 ; i--){
            sb.insert(i+1, count++);
        }
        System.out.println(sb);
    }

    // WAP to count vowels
    // input : International
    // output: 6

    // method 1
    public static void countNumberOfVowelsM1(){
        String s1 = "International";
        int count = 0;
        String s2 = s1.toLowerCase();
        for (int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);
            if(c == 'a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

//    Method 2
    public static void countNumberOfVowelsM2(){
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        int count = 0;
        for (int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }



    // input : International
    // output : 6nt5rn4t32n1l
    public static void replaceVowelsWithCount(){
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        int count =0;
        StringBuilder sb = new StringBuilder(s1);
        for(int i =sb.length()-1;i >=0;i--){
            if(s2.contains(String.valueOf(sb.charAt(i)))){
                sb.deleteCharAt(i);
                sb.insert(i,++count);
            }
        }
        System.out.println(sb);
    }


    // input : International
    // output : ntrntnlIeaioa
    public static void vowelsAtLastOfString(){
        String s1 = "International";
//        StringBuilder sb = new StringBuilder();
//        String s3 = "";
//        String s2 = "AEIOUaeiou";
//        for(int i =0;i <s1.length();i++){
//            if(s2.contains(String.valueOf(s1.charAt(i)))){
//                sb.append(s1.charAt(i));
//            }else{
//                s3 += s1.charAt(i);
//            }
//        }
//        System.out.println(s3 + sb);

//        OR

        StringBuilder sb = new StringBuilder();
        StringBuilder vow = new StringBuilder();
        String s2 = "AEIOUaeiou";
        for(int i =0;i <s1.length();i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                vow.append(s1.charAt(i));
            }else{
                sb.append(s1.charAt(i));
            }
        }
        sb.append(vow);
        System.out.println(sb);
    }



    // input = "International"
    // output = "Iaaeilnnnortt"

    public static void sortArrayInAscOrder(){
        String s1 = "International";
        char[] c = s1.toCharArray();
        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));
        String s2 = new String(c);
        System.out.println(s2);
    }


    // input = "International"
    // output = "1nt2rn1t21n2l"

    public static void replaceVowWith1And2(){
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i =0;i<s1.length();i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                if(count % 2 != 0){
                    sb.append(count);
                    count++;
                }else {
                    sb.append(count);
                    count--;
                }
            }else {
                sb.append(s1.charAt(i));
            }

        }
        System.out.println(sb);
    }




    // HW
    // intput = "Hello I am Java Developer"
    // output = 5

    public static void countNumberOfWords(){
        String s1 = "Hello I am Java Developer";
        int count = 0;
        String[] s2 = s1.split(" ");
//        System.out.println(Arrays.toString(s1.split(" ")));
//        for(int i = 0;i < s2.length;i++){
//                if(s2[i].length() != 0){
//                    count++;
//                }
////                if(!s2[i].isEmpty()){
////                    count++;
////                }
//
//        }
        for (String s : s2) {
            if (!s.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }


    // WAP to find the largest length of string in sentence
    public static void findLargesString(){
        String s1 = "welcome to international airport";
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        int lrg = -1;
        for(int i =0; i<s2.length;i++){
//            int temp = s2[i].length();
            if(s2[i].length() > lrg){
                lrg = s2[i].length();
            }
        }
        for(int i=0;i < s2.length;i++){
            if(lrg == s2[i].length()){
                System.out.println(s2[i]);
            }
        }

//        System.out.println(sb.append(lrg));

    }


    // reverse and each word in String

    public static void reverseEachWordsInString(){
        String s1 = "Hello I am Java Developer";
        int count = 0;
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s2.length;i++){
            String temp = s2[i];
            StringBuilder revStr = new StringBuilder(temp);
            if(temp.length() !=0){
                 sb.append(revStr.reverse());
            }
            if(i < s1.length()){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }



    // WAP to shift first char to last from each word of string.
    // inp: hello i am java developer
    // op: elloh i ma avaj eveloperd

    public static void shiftFirstCharToLastForEachWord(){
        String s1 = "hello i am java developer";
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        for(int i =0;i < s2.length; i++){
            if(s2[i].length() != 0){
                sb.append(s2[i].substring(1));
                sb.append(s2[i].charAt(0));
            }

            if(i < s2.length -1){
                sb.append(" ");
            }

        }
        System.out.println(sb);
    }


    // WAP to delete first char from each word add it to last of string
    // inp : hello i am java developer
    // op : ello m ava eveloper hiajd

    public static void deleteFirstAndAddItToLastOfString(){
        String s1 = "hello i am java developer";
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder last = new StringBuilder();
        for(int i =0; i < s2.length;i++){

            sb.append(s2[i].substring(1));
            last.append(s2[i].charAt(0));
            sb.append(" ");
        }
        System.out.println(sb.append(last));
    }

    // WAP to sort a words lexicographycally
    // inp: hello i am java developer
    // opt: am developer hello i java

    public static void sortWordsLexicographycally(){
        String s1 = "hello i am java developer";
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s2);
        for(int i =0; i < s2.length;i++){
            sb.append(s2[i]).append(" ");
        }
//        System.out.println(Arrays.toString(s2));
        System.out.println(sb);
    }



    // WAP to sort words lengthwise

    public static void sortWordsLengthwise(){
        String s1 = "hello i am java developer";
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
//        for(int i =0; i< s2.length;i++){
//            int size = s2[i].length();
//
////            Arrays.sort(s2);
//
////            System.out.println(s2[i].length());
//        }
    }



















}
