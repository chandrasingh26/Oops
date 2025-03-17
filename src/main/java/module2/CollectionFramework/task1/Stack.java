package module2.CollectionFramework.task1;

import java.util.concurrent.CopyOnWriteArrayList;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.add(1);
        stack.push(2);
        stack.push(3);
        stack.add(4);
        stack.add(5);

//        System.out.println(stack);
//
//        Integer removed = stack.pop();
//
//        System.out.println(removed);
//
//        System.out.println(stack);
//        System.out.println(stack.peek());

        CopyOnWriteArrayList<String> copy = new CopyOnWriteArrayList<>();

        copy.add("Milk");
        copy.add("Biscuit");
        copy.add("Bread");

        System.out.println("Initial copy " + copy);

        for( String item : copy) {
            System.out.println(item);

            if(item.equals("Bread")) {
                copy.add("Butter");
                System.out.println("Added Butter while reading");
            }

        }

        System.out.println("Updated copy " + copy);


    }
}
