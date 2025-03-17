package module2.CollectionFramework.task1;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(30);

        System.out.println(list.get(2));

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list.add(1, 10);

        list.set(1, 20);       // overwrite the value at index given

        for(int x : list) {
            System.out.println(x);
        }

        list.remove(1);
        list.trimToSize();      // trim to element according to size of list defined.

        for(int x : list) {
            System.out.println(x);
        }


    }

}
