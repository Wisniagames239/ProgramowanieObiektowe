package Zad6;

public class Test {
    public static void main(String[] args) {
        Integer[] liczby = new Integer[10];
        liczby[0] = 1;
        liczby[1] = 7;
        liczby[2] = 3;
        liczby[3] = 5;
        liczby[4] = 98;
        liczby[5] = 1;
        liczby[6] = 7;
        liczby[7] = 54;
        liczby[8] = 32;
        liczby[9] = 23;
        for (var i : liczby) {
            System.out.print(i + "\t");
        }
        System.out.println();
        Alg.sortDescending(liczby);
        for (var i : liczby) {
            System.out.print(i + "\t");
        }
    }
}
