package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();

        boolean check = arrayList.add(10);

        if(check == arrayList.add(10)){
            arrayList.add(20);
        }

        arrayList.add(true);
        arrayList.add("String");
        arrayList.add(12.3);
        arrayList.add(12.1234);
        arrayList.add("A");


        arrayList1.add(20);
        arrayList.addAll(2, Collections.singleton(30));
        arrayList1.addAll(1,Collections.singleton(40));



        System.out.println(arrayList.size());

        System.out.println(arrayList);
        System.out.println(arrayList1);

        
    }



}
