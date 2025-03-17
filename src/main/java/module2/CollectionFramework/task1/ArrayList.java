package module2.CollectionFramework.task1;

import java.util.Comparator;

// Logic for custom sorting
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}



public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(30);

        //System.out.println(list.get(2));

        list.sort(new MyComparator());
        System.out.println(list);

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        list.add(1, 10);
//
//        list.set(1, 20);       // overwrite the value at index given

        for(int x : list) {
            System.out.println(x);
        }


    }

}
