package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSetProgram {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();


//        treeSet.add(null);
//        treeSet.add(10);
//        treeSet.add(10);
//        treeSet.add(true);
//        treeSet.add("String");
//        treeSet.add(12.42);  // null not allowed, duplicates not allowed, doesn't maintain order, heterogeneous not allowed.


        treeSet.add(10);
        treeSet.add(43);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(90);






        System.out.println(treeSet);
        System.out.println(treeSet.contains(30));
        System.out.println(treeSet.tailSet(30));
        System.out.println(treeSet.ceiling(40)); // find the least element, or equal element for set
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
//        System.out.println(treeSet.ceiling(20));


    }

}
