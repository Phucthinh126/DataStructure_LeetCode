package list_java.list_Iterator;

import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void demoIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(4);

        // create ListIterator
        ListIterator<Integer> iterlis = list.listIterator();

        iterlis.next();
        iterlis.next();
        int previousIndex = iterlis.previousIndex();
        int nextIndex = iterlis.nextIndex();

        // in ra previous
        System.out.println("previous element: " + iterlis.previous()); // tra ve phan tu truoc con tro hien tai va lui
                                                                       // con tro lai
        // 3 7| 1 4 → 3 |7 1 4

        System.out.println("next element: " + iterlis.next()); // tra ve phan tu duoc next va di chuyen con tro sang
                                                               // phai
        // | 3 7 1 4 → 3 7| 1 4
        // tra ve 7, cursor sang phai

        System.out.println("previous index: " + previousIndex); // trả về chỉ số của phần tử cuối cùng được next() hoặc
                                                                // previous() trả về
        System.out.println("next index: " + nextIndex); // tra ve gia tri index cua phan tu ke tiep

    }

    // demo remove()
    public static void demoRemove() {
        List<String> list = new ArrayList<>();
        list.add("Thinh");
        list.add("Phuc");
        list.add("Huynh");
        list.add("Dep");
        list.add("Trai");

        // create ListIterator
        ListIterator<String> iterlis = list.listIterator();

        // remove() su dung next()
        System.out.println("Su dung next() de xoa element");
        while (iterlis.hasNext()) {
            String n = iterlis.next();
            if (n.equals("Phuc")) {
                iterlis.remove(); // xoa chuoi trung
                System.out.println("Da xoa: " + n);
            }
        }
        System.out.println("Ket qua: " + list);
        System.out.println();

        // remove() su dung previous
        System.out.println("Su dung previous de xoa element");
        while (iterlis.hasPrevious()) {
            String m = iterlis.previous();
            if (m.equals("Huynh")) {
                iterlis.remove();
                System.out.println("Da xoa " + m);
            }
        }
        System.out.println("Ket qua: " + list);
    }

    public static void main(String[] args) {
        demoIndex();
        System.out.println("---------------------------------------");
        demoRemove();
    }
}
