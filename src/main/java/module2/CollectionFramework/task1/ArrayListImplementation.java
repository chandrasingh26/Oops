package module2.CollectionFramework.task1;

import java.util.Arrays;

public class ArrayListImplementation {

    private Object[] data;
    private int size = 0;
    private static final int CAPACITY = 10;

    public ArrayListImplementation() {
        data = new Object[CAPACITY];
    }

    private void capacity() {
        if(size == data.length) {
            int newCapacity = data.length + (data.length)/2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public void add(int element) {
        capacity();
        data[size++] = element;
    }

    public void remove(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bound");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;

    }

    public void removeData(int index, int value) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bound");
        }
        if((int) data[index] == value) {
            data[index] = data[index + 1];
            size--;
        }
        else {
            System.out.println("Value at index" + index + "does not match with" + value);
        }
    }
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        }
        return (int) data[index];
    }

    public void writeValue(int index, int value){
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        }

        if (data[index] != null) {
            data[index] = value;
        }
    }

    public void printElement() {
        for(int i=0; i<size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListImplementation arr = new ArrayListImplementation();

        arr.add(4);
        arr.add(6);
        arr.add(3);

        arr.printElement();

//        arr.remove(2);
//        arr.removeData(0, 4);
//        arr.printElement();
        arr.writeValue(0, 3);

        arr.printElement();

        //System.out.println(arr.get(0));
    }

}
