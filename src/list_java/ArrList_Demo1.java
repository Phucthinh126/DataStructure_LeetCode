package list_java;

import java.util.ArrayList;

public class ArrList_Demo1 {
    public static void list() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(4);
        System.out.println(list);
    }

    public static void main(String[] args) {
        list();
    }
}