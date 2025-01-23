package collection;

import java.util.Collection;

public class Count {
    public static <T> int countOccurrences(Collection<T> items, T element) {
        int count = 0;
        for (T item : items) {
            if(item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
