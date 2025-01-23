package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Kolekcja {
    public static <T> void printUnique(Collection<T> items)
    {
        Set<T> uniqueElements = new HashSet<T>(items);
        for(T item : uniqueElements)
        {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {

    }
}

