package arraylisty;

import java.util.ArrayList;

public class MergeList {
    public static <T> ArrayList<T> mergeLists (ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {

    }
}
