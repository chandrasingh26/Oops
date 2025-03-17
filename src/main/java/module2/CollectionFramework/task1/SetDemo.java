package module2.CollectionFramework.task1;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(23);
        set.add(21);
        set.add(34);
        set.add(5);
        set.add(9);
        set.add(0);

        System.out.println(set);

        for(Integer x : set) {
            System.out.println(x);
        }

        set.remove(5);
        set.removeIf(x -> x%3 == 0);

        System.out.println(set);

        TreeSet<String> tree = new TreeSet<>();     // store element in sorted manner

        tree.add("z");
        tree.add("d");
        tree.add("f");
        tree.add("a");

        System.out.println(tree);

    }
}
