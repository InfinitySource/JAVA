package CollectionFramework.Set;

import com.sun.security.jgss.GSSUtil;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetProgram {

    public static void main(String[] args) {


        NavigableSet navigableSet = new TreeSet<>();


        navigableSet.add(10);
        navigableSet.add(10);
        navigableSet.add(30);
        navigableSet.add(65);
        navigableSet.add(36);
        navigableSet.add(45);
        navigableSet.add(20);

//        navigableSet.add(true);
//        navigableSet.add("String");
//        navigableSet.add(223.24);
//        navigableSet.add(null);
            // null not allowed, non-heterogeneous, duplicates not allowed, not maintain order.

        System.out.println(navigableSet);

        System.out.println(navigableSet.higher(30)); // return element greater than given number - 36
        System.out.println(navigableSet.ceiling(40)); // return element greater than given number or equal to that number.
        System.out.println(navigableSet.lower(30)); // return element lower than given number
        System.out.println(navigableSet.subSet(10, 60)); // return numbers betweens 10 to 60
        System.out.println(navigableSet.isEmpty()); // check empty or not
        System.out.println(navigableSet.tailSet(30)); // return all elements greater than 30 upto last element.


        System.out.println(navigableSet.pollFirst()); // return first element from  navigableSet and also update the navigableSet , by removing that element.
        System.out.println(navigableSet.pollLast()); // return last element from  navigableSet and also update the navigableSet , by removing that element.

        System.out.println(navigableSet);


        System.out.println(navigableSet.descendingSet()); // return reverse order view of set.


        System.out.println(navigableSet.getClass());


    }

}
