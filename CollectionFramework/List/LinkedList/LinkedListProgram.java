package CollectionFramework.List.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

    public static void main(String[] args) {


        // default capacity

        LinkedList linkedList = new LinkedList();


        linkedList.add(20);
        linkedList.add(true);
        linkedList.add(null);
        linkedList.add(30);
        linkedList.add(30);
        linkedList.add("String");



        System.out.println(linkedList);


        linkedList.forEach(o -> System.out.println(o));


        List newObj = Collections.synchronizedList(linkedList);


        System.out.println(newObj);


    }



}
