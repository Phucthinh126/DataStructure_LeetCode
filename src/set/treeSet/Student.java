package set.treeSet;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String classId;
    private int age;

    public Student(String name, String classId, int age) {
        this.name = name;
        this.classId = classId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getClassId() {
        return classId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Class: " + classId + ", " + "Age: " + age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}
