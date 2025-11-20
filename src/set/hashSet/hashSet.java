package set.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        // khai bao hashSet Integer
        HashSet<Integer> hashSet = new HashSet<>();

        // add

        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(9);

        // khai bao hashSet String
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("T");
        stringSet.add("N");
        stringSet.add("C");
        stringSet.add("D");
        // getSize
        System.out.println("Size cua hashSet Integer: " + hashSet.size());
        System.out.println("Size cua hashSet String: " + stringSet.size());

        // print hashSet
        // lý do khi HashSet<Integer> in ra da duoc sap xep
        // trong co ve da duoc sap xep nhung khong phai vay, do su trung hop hashCode
        // dep
        // thuc chat hashCode khong co thu tu
        System.out.println("Print HashSet");
        System.out.println("Duyet HashSet bang for-each");
        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.print(stringSet);
        System.out.println();

        System.out.println("Duyet HashSet bang Iterator");
        Iterator<Integer> hashSetIter = hashSet.iterator();
        while (hashSetIter.hasNext()) {
            System.out.print(hashSetIter.next() + " ");

        }




    }

}
