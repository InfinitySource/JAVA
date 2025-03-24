package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();


        linkedHashSet.add(10);
        linkedHashSet.add(10);// duplicates not allowed

        linkedHashSet.add(true);
        linkedHashSet.add("String");
        linkedHashSet.add(null);
        linkedHashSet.add(9274.97); // null allow, heterogeneous, maintain order, default capacity  is 16.


        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size()); // no. of element present in linkedHashSet - 5 , not count duplicates
        System.out.println(linkedHashSet.contains(20)); // false



    }

}
