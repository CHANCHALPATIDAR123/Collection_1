package Collection1;

import java.util.HashMap;
import java.util.Map;

class MergeMapsExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4); // Key "B" is common in both maps
        map2.put("D", 5);
        map2.put("E", 6);

        // Merging map2 into map1 using putAll()
        map1.putAll(map2);

        // Print the merged map
        map1.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
