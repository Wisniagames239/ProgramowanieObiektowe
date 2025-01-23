import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if(list == null || list.isEmpty())
        {
            return true;
        }
        LinkedList<T> temp = list.reversed();
        for(int i =0; i < list.size(); i++)
        {
            if(list.get(i) != temp.get(i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        System.out.println(isPalindrome(list));
    }
}
