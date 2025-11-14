package list_java;

import java.util.ArrayList;

public class ArrayList_Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(43);
        list.add(14);
        list.add(54);
        list.add(8);
        list.add(9);
        System.out.println("All List: " + list);

        // insert element
        list.add(2, 1);
        System.out.println("List after insert: " + list);

        // check empty
        System.out.println("Check list is empty: " + list.isEmpty());

        // get element at index 3
        System.out.println("Get element at index 3: " + list.get(3));

        // set element at index 4
        list.set(4, 100);
        System.out.println("List after set: " + list);

        // remove element
        list.remove(5);
        System.out.println("List after remove at index 5: " + list);
    }

}
