package CollectionFramework.genericvsnongeneric;

import java.util.ArrayList;

class MainClass {

    public static void main(String[] args) {


        // Generic Collection

        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(true);
        arrayList.add(12.2);
        arrayList.add("Tarun");

        System.out.println(arrayList);



        // Non - Generic Collection

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(436);
        arrayList1.add(283);
        arrayList1.add(123);
        arrayList1.add(152);
        arrayList1.add(164);
        arrayList1.add(173);

        System.out.println(arrayList1);



        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("Ramu");
        arrayList2.add("Raju");
        arrayList2.add("Sam");
        arrayList2.add("Arjun");

        System.out.println(arrayList2);

    }
}
