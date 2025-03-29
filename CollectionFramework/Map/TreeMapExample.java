package CollectionFramework.Map;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<String , Set<String>> m = new TreeMap<>();



//        q.add("What is java?");
//        q.add("");
//        q.add("");
//        q.add("");

        String q1 = "What is java?";
        Set<String> aq1 = new HashSet<>();

        aq1.add("Java is Programming language");
        aq1.add("Java is Device");
        aq1.add("Java is Program");
        aq1.add("Java is Virtual Machine");

        m.put(q1, aq1);


        String q2 = "Java programming language is also known as…….";
        Set<String> aq2 = new HashSet<>();

        aq2.add("KAO");
        aq2.add("OKA");
        aq2.add("AOK");
        aq2.add("OAK");

        m.put(q2, aq2);

        String q3 = "Loops in Java?";
        Set<String> aq3 = new HashSet<>();

        aq3.add("While Loop");
        aq3.add("Do While Loop");
        aq3.add("Loop");
        aq3.add("All of above");

        m.put(q3, aq3);


        String q4 = "Which of the following Java editions is suitable for the development of web applications?";
        Set<String> aq4 = new HashSet<>();


        aq4.add("Java ME");
        aq4.add("Java SE");
        aq4.add("Java EE");
        aq4.add("Java FX");

        m.put(q4, aq4);

        Set<String> set = m.keySet();


        int queNumber = 1;
        for(String s: set){

            System.out.println(queNumber++  + ") " + s);
            System.out.println();

            char ansChar = 'a';

            for(String ans : m.get(s)){
                System.out.println(ansChar++ + ") " + ans);
            }
            System.out.println("---------------------");
            System.out.println();

        };








    }



}
