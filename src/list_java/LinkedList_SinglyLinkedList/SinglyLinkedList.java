package list_java.LinkedList_SinglyLinkedList;

public class SinglyLinkedList<E> {
    // sử dụng Generic class
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // print
    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    // Add First
    public void addFirst(E data) {
        // B1. tạo node mới
        Node<E> newNode = new Node<>(data);

        // B2. Gắn newNode.next = head
        newNode.next = head;

        // B3. Cập nhật head
        head = newNode;

        if (tail == null) { // danh sach rong -> tail cung phai tro vao newNode
            tail = newNode;
        }
        size++; // tang size

    }

    // Add Last
    public void addLast(E data) {
        // B1. tao node moi
        Node<E> newNode = new Node<>(data);

        if (head == null) { // gan tail cho node cuoi
            tail = head = newNode;
        } else {
            // B2. Gan newNode lien ket voi null
            // newNode.next = null; thua

            // B3. gan cho tail.next = newNode
            tail.next = newNode;

            // B4. Cap nhat tail
            tail = newNode;
        }
        size++;

    }

    public static void main(String[] args) {
        System.out.println("========AddFirst=========");
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("BOS");
        list.addFirst("ATL");
        list.addFirst("MSP");
        // tao danh sach ban dau: BOS → ATL → MSP → null

        System.out.println("Them (LAX) vao dau danh sach");
        // them LAX vao dau
        list.addFirst("LAX");
        System.out.println("List sau khi them LAX");
        list.print();

        System.out.println();
        System.out.println("=======AddLast=========");

        SinglyLinkedList<String> list2 = new SinglyLinkedList<>();
        list2.addFirst("BOS");
        list2.addFirst("ATL");
        list2.addFirst("MSP");

        // Them MIA vao cuoi
        System.out.println("Them (MIA) vao cuoi");
        System.out.println("Sau khi them (MIA): ");

        list2.addLast("MIA");
        list2.print();

    }

    /*
     * === BẮT ĐẦU addFirst("BOS") ===
     * Bước 1: Tạo node mới: [BOS] (next = null)
     * Bước 2: Gắn newNode.next = head
     * → Trước: newNode.next = null
     * → Sau: newNode.next = null
     * Bước 3: Cập nhật head = newNode
     * → Trước: head = null
     * → Sau: head = BOS
     * Kết quả danh sách:
     * head → [BOS] → null
     * === KẾT THÚC addFirst ===
     * 
     * 
     * === BẮT ĐẦU addFirst("ATL") ===
     * Bước 1: Tạo node mới: [ATL] (next = null)
     * Bước 2: Gắn newNode.next = head
     * → Trước: newNode.next = null
     * → Sau: newNode.next = BOS
     * Bước 3: Cập nhật head = newNode
     * → Trước: head = BOS
     * → Sau: head = ATL
     * Kết quả danh sách:
     * head → [ATL] → [BOS] → null
     * === KẾT THÚC addFirst ===
     * 
     * ... (tương tự cho MSP)
     * 
     * === BẮT ĐẦU addFirst("LAX") ===
     * Bước 1: Tạo node mới: [LAX] (next = null)
     * Bước 2: Gắn newNode.next = head
     * → Trước: newNode.next = null
     * → Sau: newNode.next = MSP
     * Bước 3: Cập nhật head = newNode
     * → Trước: head = MSP
     * → Sau: head = LAX
     * Kết quả danh sách:
     * head → [LAX] → [MSP] → [ATL] → [BOS] → null
     * === KẾT THÚC addFirst ===
     */

     
    /*
     * ADD FIRST: "BOS"
     * B1: Tạo node mới: [BOS]
     * Danh sách rỗng → head = tail = BOS
     * head → [BOS](tail) → null
     * 
     * 
     * ADD FIRST: "ATL"
     * B1: Tạo node mới: [ATL]
     * B2: [ATL] → [BOS]
     * B3: head = ATL
     * head → [ATL] → [BOS](tail) → null
     * 
     * 
     * ADD FIRST: "MSP"
     * B1: Tạo node mới: [MSP]
     * B2: [MSP] → [ATL]
     * B3: head = MSP
     * head → [MSP] → [ATL] → [BOS](tail) → null
     * 
     * 
     * ADD LAST: "MIA"
     * B1: Tạo node mới: [MIA] → null
     * B2: [BOS] → [MIA]
     * B3: tail = MIA
     * head → [MSP] → [ATL] → [BOS] → [MIA](tail) → null
     * 
     * 
     * ADD LAST: "LAX"
     * B1: Tạo node mới: [LAX] → null
     * B2: [MIA] → [LAX]
     * B3: tail = LAX
     * head → [MSP] → [ATL] → [BOS] → [MIA] → [LAX](tail) → null
     */
}
