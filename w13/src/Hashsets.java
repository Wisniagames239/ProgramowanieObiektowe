import java.util.HashSet;

public class Hashsets {
    public static <T> boolean hasCommonElements(HashSet<T> set1, HashSet<T> set2) {
        if(set1 == null || set2 == null ||set1.isEmpty() || set2.isEmpty())
        {
            return false;
        }
        for(T element1 : set1){
            if(set2.contains(element1))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet();
        set2.add(7);
        set2.add(8);
        set2.add(9);
        System.out.println(hasCommonElements(set1, set2));
    }
}
