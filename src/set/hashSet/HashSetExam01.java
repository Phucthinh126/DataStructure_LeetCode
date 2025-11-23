package set.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExam01 {
    // chuyển đổi hashSet thành list
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Thinh");
        set.add("Huynh");
        set.add("Phuc");

        // chuyen doi set thanh list
        List<String> list = new ArrayList<>();
        list.addAll(set);
        System.out.println("HashSet conver to List: " + "\n" + list);
    }

}
