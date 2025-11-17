package list_java.linkedList_CircularLinkedList;

public class Node2 {
    // Doubly Circular Linked List
    int data;
    Node2 prev;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static void main(String[] args) {
        Node2 head = new Node2(10);

        head.next = new Node2(30);
        head.next.prev = head;

        head.next.next = new Node2(40);
        head.next.next.prev = head.next;

        head.next.next.next = new Node2(50);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = head;
        head.next.next.next.next.prev = head.next.next.next;

        Node2 current = head;
        boolean first = true;

        do {
            if (!first) {
                System.out.print(" <->");
            }
            System.out.print(current.data);
            current = current.next;
            first = false;
        } while (current != head);
        System.out.println(" (vong lai dau)");

    }

}
