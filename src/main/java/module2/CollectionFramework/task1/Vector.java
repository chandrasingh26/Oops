package module2.CollectionFramework.task1;

public class Vector {

    public static void main(String[] args) {

        java.util.Vector<Integer> vector = new java.util.Vector<>(12, 2);

        System.out.println(vector.capacity());

        for(int i=0; i<14; i++) {
            vector.add(i);
        }

        System.out.println(vector);

        vector.set(5,15);

        vector.remove((int) 7);
        vector.removeLast();

        System.out.println(vector);

        vector.trimToSize();

        System.out.println(vector.capacity());
    }
}
