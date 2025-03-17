package module2.CollectionFramework;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

    /*    HashMap<Integer, String> hashmap = new HashMap<>();

        hashmap.put(1, "Alice");
        hashmap.put(2, "Al");
        hashmap.put(4, "Ram");
        hashmap.put(3, "Mohan");
        hashmap.put(7, "Suraj");

        // System.out.println(hashmap);

        System.out.println(hashmap.containsValue(5));

        String s = hashmap.get(5);
        System.out.println(s);

        Set<Integer> keys = hashmap.keySet();

        for(Integer i : keys) {                       // For printing values only
            System.out.println(hashmap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();

        for(Map.Entry<Integer, String> i : entries) {       // For printing key and values
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    */

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(12,0.8f, true);    // maintain order

        linkedHashMap.put("Orange" , 10);
        linkedHashMap.put("Apple" , 20);
        linkedHashMap.put("Guava" , 30);

        System.out.println(linkedHashMap.get("Apple"));

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        HashMap<Integer, String> map = new HashMap<>();

        LinkedHashMap linkedmap = new LinkedHashMap(map);    // creation of linked HashMap using hashMap

    }
}
