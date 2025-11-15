package list_java.LinkedList_SinglyLinkedList;


public class SinglyLinkedList<E> {
    private Node<E> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add First
    public void addFirst(E data) {
        // B1. tạo node mới
        Node<E> newNode = new Node<>(data);

        // B2. Gắn newNode.next = head
        newNode.next = head;

        // B3. Cập nhật head
        head = newNode;
        size++; // tang size

    }

    

}
