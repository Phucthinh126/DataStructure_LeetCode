package list_java.LinkedList_SinglyLinkedList;

public class LinkedList_Remove {
  public static void main(String[] args) {
    SinglyLinkedList<String> list = new SinglyLinkedList<>();
    list.addFirst("BOS");
    list.addFirst("ALT");
    list.addFirst("MSP");
    list.addFirst("LAX");
    System.out.println("Danh sach ban dau:");
    list.print();
    System.out.println("Xoa phan tu dau (LAX)" );
    String remove =  list.removeFirst();
    System.out.println("Da xoa: " + remove);
    System.out.println("List sau khi xoa phan tu dau");
    list.print();




  }
}
