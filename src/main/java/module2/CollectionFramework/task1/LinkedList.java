package module2.CollectionFramework.task1;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        list.add(2);
        list.add(0, 5);
        list.add(2);
        list.addFirst(0);     // O(1) time complexity
        list.addLast(7);

        System.out.println(list.getLast());   // O(n)

        list.removeIf(x-> x%2 == 0);

        System.out.println(list);

        java.util.LinkedList<String> animals = new java.util.LinkedList<>(Arrays.asList("Cat", "Dog", "Lion"));

        java.util.LinkedList<String> ani = new java.util.LinkedList<>(Arrays.asList("Lion", "Tiger"));

        //animals.removeAll(ani);

        animals.addAll(ani);

        System.out.println(animals);

    }
}
