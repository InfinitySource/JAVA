package CollectionFramework.Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeProgram {

    public static void main(String[] args) {


        Map<String, String> m = new TreeMap<>();

        m.put("r", "red");
        m.put("p", "pink");
        m.put("b", "black");
        m.put("g", "gray");
        m.put("w", "white");

        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m.get("r"));
        System.out.println(m.get("n"));
        System.out.println(m.containsKey("r"));
        System.out.println(m.containsValue("white"));
        System.out.println(m.size());


        Set<String> set =  m.keySet();



        for(String s : set){
            System.out.println(s + "\t" + m.get(s));
        }


        System.out.println("-------------------------------");


        Set<Entry<String, String>> set1 = m.entrySet();


        for(Entry<String, String> s : set1){
            System.out.println(s.getKey() + "\t" + s.getValue());
        }



    }
}
