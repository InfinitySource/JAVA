package CollectionFramework.Set;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProgram {


    public static void main(String[] args) {


        HashSet hashSet = new HashSet<>();

        hashSet.add(10); // duplicates not allowed , it automatically removes it.
        hashSet.add(10);


        hashSet.add(null);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(true);  // not maintain order, null allowed, heterogeneous elements

        // default capacity of HashSet is 16, increases by 2x



        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty()); // check empty or not - return in boolean
        System.out.println(hashSet);

        System.out.println(hashSet.size());
        Set hashSet2 =  (Set) hashSet.clone();
//        List hashSet3 = (List) hashSet.clone(); // cannot cast HashSet to List - ClassCastException

        System.out.println(hashSet2); // it copies the hashSet object and elements.
//        System.out.println(hashSet3);



    }

}
