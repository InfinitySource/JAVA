package CollectionFramework.List.Stack;

import java.util.Stack;

public class StackProgram {

    public static void main(String[] args) {

        Stack stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println(stack);



        System.out.println(stack.empty()); // false
        System.out.println(stack.capacity()); // 10
        System.out.println(stack.remove(1)); // remove element at index 1 - 20
        System.out.println(stack); // [10,20]
        stack.add(50);
        System.out.println(stack); // [10,30,50]
        System.out.println(stack.pop()); // give you an element which is present at last of stack, because it follows LIFO(last in first out) order and remove from the original stack.
        System.out.println(stack); // [10,,30]
        System.out.println(stack.push(20)); // push method add element at the last of stack means top of stack, it updates in stack output also.
        System.out.println(stack); // [10,30,20]


        stack.add(true);
        stack.add(60);
        stack.add(60);
        stack.add(null);

        System.out.println(stack);



    }

}
