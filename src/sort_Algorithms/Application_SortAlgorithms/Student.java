package sort_Algorithms.Application_SortAlgorithms;

public class Student {
    private String id;
    private String fullName;
    private String academicYear;
    private double math;
    private double chemistry;
    private double physic;

    public Student(String id, String fullName, String academicYear, double math, double chemistry, double physic) {
        this.id = id;
        this.fullName = fullName;
        this.academicYear = academicYear;
        this.math = math;
        this.chemistry = chemistry;
        this.physic = physic;
    }

    // getDTB
    public double getDTB() {
        double sum = math + chemistry + physic;
        double dtb = sum / 3.0;
        return dtb;
    }

    @Override
    public String toString() {
        return "Name: " + id + ", Fname: " + fullName + ", Academic year: " + academicYear + "\n" + "score: " + "\n"
                + "Math: " + math + "\n" + "chemistry: "  + chemistry + "\n" + "physic: " + physic;

    }

}