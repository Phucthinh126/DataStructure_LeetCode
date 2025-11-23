package set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // TreeSet rỗng
        Set<Integer> set = new TreeSet<>();
        System.out.println("TreeSet is empty: " + set);

        System.out.println("TreeSet:");
        set.add(4);
        set.add(5 );
        set.add(2);
        set.add(0);
        set.add(1);
        set.add(3);
        System.out.println(set);
    }

}
