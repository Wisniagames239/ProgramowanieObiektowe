import java.util.SortedSet;
import java.util.TreeSet;

public class Tree {
    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> drzewo, T lowerBound, T upperBound)
    {
        if(drzewo == null || drzewo.isEmpty())
        {
            return null;
        }
        TreeSet<T> result = new TreeSet<T>(drzewo.subSet(lowerBound, drzewo.higher(upperBound)));
        return result;


    }

    public static void main(String[] args) {
        TreeSet<Integer> drzewo = new TreeSet<>();
        drzewo.add(1);
        drzewo.add(2);
        drzewo.add(3);
        drzewo.add(4);
        drzewo.add(5);
        System.out.println(findElementsInRange(drzewo, 2, 4));;
    }
}
