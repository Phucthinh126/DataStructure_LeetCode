package set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "VL1", 20);
        Student s2 = new Student("Tan A Dai", "BN2", 19);
        Student s3 = new Student("Em A Ai", "VL2", 18);
        Student s4 = new Student("Vo Ra", "FN3", 21);

        Set<Student> listClass = new TreeSet<>();
        listClass.add(s1);
        listClass.add(s2);
        listClass.add(s3);
        listClass.add(s4);

        for (Student studen : listClass) {
            System.out.println(studen + "\n");
        }
    }

}
