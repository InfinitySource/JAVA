package CollectionFramework.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetProgram {

    public static void main(String[] args) {

        SortedSet sortedSet = new TreeSet<>();

        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(6);
        sortedSet.add(2);
        sortedSet.add(9);
        sortedSet.add(1);

        System.out.println(sortedSet); // sort the array in ascending order.

        System.out.println(sortedSet.first()); // give first element from sortedSet. - 1
        System.out.println(sortedSet.last()); // give last element from sortedSet. - 9

        System.out.println(sortedSet.subSet(2, 9)); // return all element present in that range(2 to 9) - [2,3,5,6]



        SortedSet sortedSet1 = new TreeSet<>();

//        sortedSet1.add(null);
//        sortedSet1.add("String");
        sortedSet1.add(true);
        sortedSet1.add(false);
//        sortedSet1.add(3247.239);
        // null not allowed, non-heterogeneous, duplicates not allowed, doesn't maintain order.



        System.out.println(sortedSet1);

    }

}
