package set.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet_Method {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // add - O(1)
        set.add("A");
        set.add("S");
        set.add("V");
        set.add("M");
        set.add("R");

        System.out.println("Add F vao set: " + set.add("F"));
        System.out.println("_________________________________");

        // print
        System.out.println("Hash Set: ");
        System.out.println(set);
        System.out.println("_________________________________");

        // size() - O(1)
        System.out.println("Size cua hashSet: " + set.size());
        System.out.println("_________________________________");

        // remove O(1)
        set.remove("V");
        System.out.println("Remove M" + "\n" + "HashSet after removing");
        System.out.println(set);
        System.out.println("_________________________________");

        // su dung Iterator() de duyet qua HashSet
        System.out.println("Duyet hash set su dung iterator");
        Iterator<String> setIt = set.iterator();
        while (setIt.hasNext()) {
            System.out.print(setIt.next() + " ");
        }
        System.out.println();
        System.out.println("_________________________________");

        System.out.println("Duyet hash set su dung for-each");
        for (String setFor : set) {
            System.out.print(setFor + " ");

        }
        System.out.println();

        // contains() O(1) - kiem tra phan tu ton tai trong hash set
        System.out.println("_________________________________");
        System.out.println("R co bi chua trong hashSet khong: ");
        if (set.contains("G")) {
            System.out.println("Found");
        } else {
            System.err.println("Not Found");
        }

        System.out.println("_________________________________");
        // isEmpty() - kiem tra hashSet co rong khong
        if (!set.isEmpty()) {
            System.out.println("HashSet khong rong");
        } else {
            System.out.println("HashSet rong");
        }

        // addAll()
        System.out.println("_________________________________");
        List<String> list = Arrays.asList("G", "S", "L");
        System.out.println("List" + list.toString());
        System.out.println("Them list vao hashSet");
        set.addAll(list);
        System.out.println("HashSet sau khi add list: ");
        System.out.println(set);

        // clear()
        System.out.println("_________________________________");
        System.out.println("Clear HashSet");
        set.clear();
        System.out.println("HashSet sau khi clear()");
        System.out.println(set);
    }

}