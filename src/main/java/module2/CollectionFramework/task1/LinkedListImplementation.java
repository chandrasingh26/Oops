package module2.CollectionFramework.task1;

public class LinkedListImplementation {
    Node head;

    public class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {                  // when ll is empty
            head = newNode;
            return;
        }
        Node temp = head;                   // when ll contains some nodes
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void remove(int data) {
        if (head == null)                   // empty ll
            return;

        if (head.data == data) {            // head is pointing to same data
            head = head.next;
            return;
        }

        Node temp = head;                                             // element is present somewhere in between or end
        while(temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }


    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();

        list.add(4);
        list.add(5);
        list.add(4);
        list.add(2);

        list.print();

        list.remove(3);

        list.remove(4);

        list.print();

    }

}
