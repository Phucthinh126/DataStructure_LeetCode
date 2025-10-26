package sort_Algorithms.Application_SortAlgorithms;

public class MainTesst {
    public static void main(String[] args) {
        Student student1 = new Student("Thinh", "Huynh Phuc Thinh", "2024", 9.9, 9.0, 9.6);
        Student student2 = new Student("A", "Nguyen Van A", "2024", 8.2, 5.6, 9.6);
        Student student3 = new Student("B", "Nguyen Thi B", "2024", 7.5, 8.0, 7.0);
        Student student4 = new Student("C", "Tran Van C", "2024", 9.25, 7.5, 6.5);
        Student student5 = new Student("D", "Le Van D", "2024", 5.0, 7.1, 6.5);
        Student student6 = new Student("E", "Mo Vafac E", "2024", 9.5, 8.5, 6.0);
        Student[] studens = { student1, student2, student3, student4, student5, student6 };

        // thu tu theo diem tb tu thap den cao - D,B,C,A,E,Thinh
        Class_Student class1 = new Class_Student("DH24", "D24", studens);
        // class1.getArrayStuden_selection_sort();
        // class1.getArrayStuden_bubble_sort();
        class1.getArrayStuden_insert_Sort();
        System.out.println(class1.toString());

    }

}