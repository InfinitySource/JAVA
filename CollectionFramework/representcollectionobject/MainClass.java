package CollectionFramework.representcollectionobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class MainClass {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add(true);
        arrayList.add("String");
        arrayList.add(false);
        arrayList.add(213.22);
        arrayList.add(125);




        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);


        // using sop
        System.out.println(arrayList);

        System.out.println("---------------------");

        // by using get() method
        System.out.println(arrayList.get(2));


        System.out.println("---------------------");


        // by using for loop

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("---------------------");

        // advance for loop
        for(int a : arrayList1){
            System.out.println(a);
        }

        System.out.println("---------------------");

        // by using iterator() method
        Iterator<Integer> itr = arrayList.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------------");

        // by using ListIterator() method

        ListIterator<Integer> litr = arrayList.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("---------------------");

        // by using forEach() method
        arrayList.forEach(o -> System.out.println(o));


        System.out.println("---------------------");


        // by using spliterator() method.
        arrayList1.spliterator().forEachRemaining(o -> System.out.println(o));


        System.out.println("---------------------");


    }


}
