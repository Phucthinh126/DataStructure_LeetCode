package sort_Algorithms.Application_SortAlgorithms;

public class Class_Student {
    private String idClass;
    private String nameClass;
    private Student[] arrayStudents;

    public Class_Student(String idClass, String nameClass, Student[] arrayStudents) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.arrayStudents = arrayStudents;
    }

    public int getLengthArray() {
        return arrayStudents.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Ma Lop: " + idClass);
        str.append(", Ten Lop: " + nameClass);
        str.append(", Danh sach sinh vien: ");
        str.append("\n");
        for (Student student : arrayStudents) {
            str.append(student.toString()).append("\n");
            str.append("-----------");
            str.append("\n");
        }
        return str.toString();
    }

    // selection_sort
    public Student[] getArrayStuden_selection_sort() {
        for (int i = 0; i < getLengthArray() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < getLengthArray(); j++) {
                if (arrayStudents[minIndex].getDTB() > arrayStudents[j].getDTB()) {
                    minIndex = j;
                }
            }
            Student temp = arrayStudents[i];
            arrayStudents[i] = arrayStudents[minIndex];
            arrayStudents[minIndex] = temp;
        }
        return arrayStudents;
    }

    // bubble sort
    public Student[] getArrayStuden_bubble_sort() {
        for (int i = 0; i < arrayStudents.length; i++) {
            for (int j = 0; j < arrayStudents.length - i - 1; j++) {
                if (arrayStudents[j].getDTB() > arrayStudents[j + 1].getDTB()) {
                    Student temp = arrayStudents[j];
                    arrayStudents[j] = arrayStudents[j + 1];
                    arrayStudents[j + 1] = temp;
                }
            }
        }
        return arrayStudents;
    }

    // insert sort
    public Student[] getArrayStuden_insert_Sort() {
        for (int i = 0; i < arrayStudents.length; i++) {
            Student key = arrayStudents[i];
            int j = i - 1;
            while (j >= 0 && arrayStudents[j].getDTB() > key.getDTB()) {
                arrayStudents[j + 1] = arrayStudents[j];
                j = j - 1;
            }
            arrayStudents[j + 1] = key;
        }
        return arrayStudents;
    }

}