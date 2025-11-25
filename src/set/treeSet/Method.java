package set.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Method {

    public static void main(String[] args) {
        // tao TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add
        set.add(3);
        set.add(2);
        set.add(0);
        set.add(9);
        set.add(6);
        set.add(6);
        set.add(6);
        set.add(1);

        System.out.println("Print TreeSet: ");
        System.out.println(set);
        System.out.println("____________________________________");

        // contains
        System.out.println("TreeSet chua 9: " + set.contains(9));
        System.out.println("____________________________________");

        // remove
        System.out.println("Remove 6");
        set.remove(6);
        System.out.println("TreeSet after remove 6: ");
        System.out.println(set);

        // iterator
        System.out.println("____________________________________");
        System.out.println("Duyet TreeSet bang Iterator: ");
        Iterator<Integer> setIt = set.iterator();
        while (setIt.hasNext()) {
            System.out.print(setIt.next() + " ");
        }

    }
}