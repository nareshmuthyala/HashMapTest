import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Naresh on 22 January 2017.
 */
public class HashMapTest {
    public static void main(String args[]) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        map1.put(4, "Four");

        iterateMap(map1);

        Map<String, Integer> map2 = new TreeMap<>(new MyComparator());
        for (Map.Entry set : map1.entrySet()) {
            map2.put((String) set.getValue(), (Integer) set.getKey());
        }

        iterateMap(map2);

    }

    public static <K, V> void iterateMap(Map<K, V> map) {
        System.out.println("------------------------");
        for (Map.Entry<K, V> set : map.entrySet()) {
            System.out.println("--");
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }
    }
}

