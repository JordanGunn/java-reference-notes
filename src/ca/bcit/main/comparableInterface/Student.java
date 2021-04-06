package ca.bcit.main.comparableInterface;

// use implements Comparable (interface)
// used primarily for sorting OBJECTS
public class Student implements Comparable {
    private String name;
    private int grade;
    private double gpa;

    public Student(String name, int grade, double gpa){
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Object temp) {
        Student other = (Student) temp;

        // returns 1 if first param is greater than second param
        // returns -1 if second param is greater than first param
        // return 0 if params are equal
        return Integer.compare(getGrade(), other.getGrade());
    }
}


