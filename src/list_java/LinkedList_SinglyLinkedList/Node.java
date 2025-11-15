package list_java.LinkedList_SinglyLinkedList;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data2) {
        this.data = data2;
        this.next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
