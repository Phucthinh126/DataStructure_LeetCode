package list_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void listIteratorDemo() {
        // tạo một list
        List<String> name = new LinkedList<>();
        name.add("thinh");
        name.add("phuc");
        name.add("huynh");
        // create listIterator
        ListIterator<String> iterlist = name.listIterator();

        // duyet cac phan tu bang method next
        while (iterlist.hasNext()) {
            System.out.println(iterlist.next());
        }
    }

    // demo 2
    public static void exampleListIterator() {
        Integer[] array = { 2, 4, 6, 7, 8, 9 };
        ListIterator li = Arrays.asList(array).listIterator();
        System.out.println("List hasNext(): " + li.hasNext());
        System.out.println("List next(): " + li.next());
        System.out.println("List next(): " + li.next());
        System.out.println("List previous: " + li.previous());
        System.out.println("List previous: " + li.previous());
    }

    // example next() va previous
    public static void exampleNextPrevious() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");

        // create ListIterator
        ListIterator<String> iterLis = list.listIterator();

        // print list
        System.out.println("List: " + list);

        // dung next()
        System.out.println("---Traverse use next()---");
        while (iterLis.hasNext()) {
            String n = iterLis.next();
            System.out.println("Next() " + n + "\t" + "(index " + iterLis.previousIndex() + ")");
        }
        System.out.println("Đã đến cuối list");
        System.out.println();

        // dung previous
        System.out.println("---Traverse use previous()---");
        while (iterLis.hasPrevious()) {
            String m = iterLis.previous();
            System.out.println("Previous() " + m + "\t" + "(index " + (iterLis.previousIndex() + 1) + ")");
        }
        System.out.println("Đã đến đầu list");
    }

    public static void main(String[] args) {
        listIteratorDemo();
        System.out.println("----------------------------");
        exampleListIterator();
        System.out.println("----------------------------");
        exampleNextPrevious();
    }

}
