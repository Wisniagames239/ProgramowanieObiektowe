package z18;

import java.util.Arrays;

public class TestMovie {
    public static void main(String[] args) {
        Movie[] movies = {new Movie("AAAA", "AA", "C"),
                new Movie("C", "AA", "C"),
                new Movie("BB", "AA", "C"),
                new Movie("D", "AA", "C")};
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));
    }
}
