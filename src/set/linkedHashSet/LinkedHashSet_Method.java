package set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Method {
    // phương thức của linkedHashSet
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        // add
        set.add("A");
        set.add("Thinh");
        set.add("Huynh");
        set.add("Phuc");
        set.add("B");

        System.out.println("List: ");
        System.out.println(set);
        System.out.println("Them phan tu moi kiem tra thu tu: ");
        set.add("H");
        // su dung iterator de in linkedHashSet
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // xoa phan tu
        set.remove("Huynh");
        System.out.println("Xoa phan tu [Huynh]: ");
        System.out.println("After removing element: ");
        for (String string : set) {
            System.out.print(string + " ");
        }
        System.out.println();

    }

}
