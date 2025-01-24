package Zad6;

public class Alg {
    public static <T extends Comparable<T>> void sortDescending(T[] a) {
        for (int i = 0; i<a.length; i++) {
            for(int j = i; j<a.length; j++)
            {
                if(a[i].compareTo(a[j]) < 0)
                {
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
