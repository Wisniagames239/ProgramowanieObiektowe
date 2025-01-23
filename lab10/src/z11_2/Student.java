package z11_2;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    String name;
    double averageGrade;
    int yearOfStudy;
    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public int compareTo(Student o) {
        int result = -Double.compare(averageGrade, o.averageGrade);
        if(result == 0)
        {
            return this.yearOfStudy - o.yearOfStudy;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student[] students = {new Student("AA",4.6,2),new Student("BB",4.1,5),new Student("CC",4.1,6), new Student("DD",3.2,1)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
