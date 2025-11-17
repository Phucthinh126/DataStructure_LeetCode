package list_java.linkedList_CircularLinkedList;

public class Node {
    // Circular Singly Linked List
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head;

        System.out.println("Singly Circular Linked List:");
        Node current = head;
        boolean first = true;
        do {
            if (!first) {
                System.out.print(" -> ");
            }
            System.out.print(current.data);
            current = current.next;
            first = false;

        } while (current != head);
        System.out.println(" -> (Vong lai dau)");

    }

}
