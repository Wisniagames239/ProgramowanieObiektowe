package z1;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] s1 = {new Student("AA",4.6,2000), new Student("BB",4.1,2000),new Student("CC",4.9,2006), new Student("DD",3.4,2001),new Student("EE",2.1,1999)};
        Arrays.sort(s1);
        for(Student s : s1)
            System.out.println(s);
    }
}
