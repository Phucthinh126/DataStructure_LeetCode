package list_java.list_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    // Iterator - lặp

    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Cơm");
        foods.add("Cháo");
        foods.add("Phở");
        foods.add("Bún");
        foods.add("xôi");
        foods.add("mì");
        foods.add("bánh mì");

        // lấy một đối tượng iterater cho ArrayList
        Iterator<String> iter = foods.iterator();

        // duyet qua cac phan tu
        // while (iter.hasNext()) {
        // // lay phan tu ra
        // String n = iter.next();
        // System.out.println(n);
        // }

        // System.out.println(iter.next()); // com
        // System.out.println(iter.next()); // chao
        // System.out.println(iter.next()); // pho

        // xóa phần tử
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);

            // xoa phần tử
            if (element.equals("Phở")) {
                iter.remove();
            }
        }
        System.out.println(foods.toString());

    }
}