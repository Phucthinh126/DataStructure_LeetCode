package list_java.linkedList_DuoublyLinkedList;

public class DoublyLinkedList {

    // Định nghĩa class Node
    public static class Node {
        // luu tru gia tri or du lieu
        int data;

        // tham chieu den Node truoc do
        Node prev;

        // tham chieu den node sau do
        Node next;

        // constructor
        public Node(int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // tao first node
        Node head = new Node(10);

        // tao link den node thu 2
        head.next = new Node(20);
        // link den node thu 1
        head.next.prev = head;

        // tao link den node thu 3
        head.next.next = new Node(30);
        // link den node thu 2
        head.next.next.prev = head.next;

        // tao link den node thu 4
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        while (head != null) {
            System.out.print(head.data + " ");
            if (head.next != null) {
                System.out.print(" <-> ");
            }
            head = head.next;
        }

    }

}
