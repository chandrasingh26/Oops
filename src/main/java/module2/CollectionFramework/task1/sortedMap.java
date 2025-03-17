package module2.CollectionFramework.task1;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap {
    public static void main(String[] args) {

        // sortedMap - interface ( extends Map )
        // TreeMap - implementation class

        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(57, "Abhi");
        map.put(76, "Jeet");
        map.put(89, "Jay");
        map.put(97, "Raghav");
        map.put(45, "Vivek");

        System.out.println(map);

        System.out.println(map.headMap(89));
        System.out.println(map.lastKey());
        System.out.println(map.tailMap(89));
    }
}
