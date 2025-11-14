package list_java;

public class LinkedList_Demo1 {
    // SINGLY LINKED LIST

    public static class Node {
        // class node
        int data;
        Node next;

        // constructor to initialize a new node with date
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        // singly LinkeList - Node
        public static void main(String[] args) {

            // crate the first node (head of the list)
            Node head = new Node(10);

            // link the second node
            head.next = new Node(30);

            // link the third node
            head.next.next = new Node(1);

            // link the fourth node
            head.next.next.next = new Node(50);

            // print linked list
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

    }

    

}
