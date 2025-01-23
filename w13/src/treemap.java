import java.util.Collections;
import java.util.TreeMap;

public class treemap {
    public static <K,V> TreeMap<K,V> reverseOrderMap(TreeMap<K,V> map) {
        TreeMap<K,V> nowa = new TreeMap<>(Collections.reverseOrder());
        nowa.putAll(map);
        return nowa;
    }
}
