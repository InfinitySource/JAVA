package CollectionFramework.List.Vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorProgram {


    public static void main(String[] args) {

        Vector vector = new Vector<>();
        Vector vector2 = new Vector<>();

        vector.add(null);
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(true);
        vector.add("String");
        vector.add(735.34);

        vector2.add(30);
        vector2.add(40);


        System.out.println(vector.capacity()); // default capacity of vector is 10.
        System.out.println(vector.remove(vector)); // false - 'remove()' called on collection 'vector' with itself as argument
        System.out.println(vector.remove(2)); // remove element from index 2 , it also returns oldValue in output
        System.out.println(vector);
        System.out.println(vector.contains(10)); // true - return true if element present in vector
        System.out.println(vector.elements().nextElement()); // return 0 element from vector -> null
        System.out.println(vector.elements().hasMoreElements()); // true
        System.out.println(vector.firstElement()); // give first element from elements , not return value and not make any change in previous vector list
        System.out.println(vector.lastElement()); // give last element from elements , not return value and not make any changes in previous vector list.
        System.out.println(vector);

        System.out.println(vector.isEmpty()); // false - it check vector list have element or not.
        System.out.println(vector.indexOf(null)); // give index of that value - 0
        System.out.println(vector.indexOf(true)); // give index of that value - 2
        System.out.println(vector.indexOf(23)); // if the element is not present than return -1.
        System.out.println(vector.equals(vector)); // true
        System.out.println(vector.equals(vector2)); // false






    }



}
