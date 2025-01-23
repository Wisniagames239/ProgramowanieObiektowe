import java.util.HashMap;

public class hashmapsy {
    public static <K,V> HashMap<V,Integer> countValueOccurrences(HashMap<K,V> map) {
        HashMap<V,Integer> result = new HashMap<>();
        for(K key : map.keySet()) {
            if(!result.containsKey(key)) {
                result.put(map.get(key) , 0);
            }
            else {
                result.put(map.get(key),result.get(key)+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,2);
        System.out.println(countValueOccurrences(map));
    }
}
