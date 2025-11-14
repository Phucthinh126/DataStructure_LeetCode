package list_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList_Demo1 {
    public static void list() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(4);
        System.out.println(list);
    }

    // constructor
    public static void constructor() {
        // 1. create empty ArrayList
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(1);
        arr1.add(8);
        System.out.println("Constructor 1. Empty ArrayList: ");
        System.out.println(arr1);
        System.out.println("-------------------");

        // 2. create constructor ArrayList(int initialCapacity)
        ArrayList<Integer> arr2 = new ArrayList<>(5);
        arr2.add(3);
        arr2.add(1);
        arr2.add(7);
        arr2.add(9);
        arr2.add(5);
        System.out.println("Constructor 2. initaialCapacity");
        System.out.println(arr2);
        System.out.println("---------------------");

        // 3. create constructor ArrayList<>(collection)
        // ArrayList chứa tất cả các phần tử của collection được truyền vào
        // collection: ArrayList, LinkedList, HashSet, TreeSet
        System.out.println("Constructor 3. ArrayList<>(Collection): ");

        // ArrayList->ArrayList
        List<String> strList = Arrays.asList("A", "B", "C");
        ArrayList<String> list1 = new ArrayList<>(strList);
        System.out.println("ArrayList -> ArrayList: ");
        System.out.println(list1);

        // tu HashSet
        Set<Integer> set = Set.of(2, 6, 4, 7); // Set.of() tu java9
        ArrayList<Integer> list2 = new ArrayList<>(set);
        System.out.println("HashSet -> ArrayList: ");
        System.out.println(list2); // thu tu khong dam bao

        // List -> ArrayList
        String[] strArray = { "T", "P", "H" };

        // chuyen thanh List
        List<String> temp = Arrays.asList(strArray); // list co dinh kich thuoc

        // Tao ArrayList tu List
        ArrayList<String> list3 = new ArrayList<>(temp);
        list3.add("S"); // ArrayList cho thep thay doi list
        System.out.println("List -> ArrayList:");
        System.out.println(list3);

        // LinkedList -> ArrayList
        LinkedList<Double> link = new LinkedList<>();
        link.add(1.4);
        link.add(5.3);
        link.add(8.7);

        ArrayList<Double> list4 = new ArrayList<>(link);
        System.out.println("LinkedList -> Arraylist: ");
        System.out.println(list4);

        // TreeSet -> ArrayList
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Banana");
        tree.add("Apple meomeo");
        tree.add("Boom");

        ArrayList<String> list5 = new ArrayList<>(tree);
        System.out.println("TreeSet -> ArrayList: ");
        System.out.println(list5);  // co thu tu

    }

    public static void main(String[] args) {
        System.out.println("ArrayList demo:");
        list();
        System.out.println();
        System.out.println("Constructor ArrayList: ");
        constructor();
    }
}