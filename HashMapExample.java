package Collection1;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

class SortMapByKeyExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Zebra", 10);
        map.put("Lion", 20);
        map.put("Elephant", 30);
        map.put("Tiger", 40);

        // Sorting by keys using TreeMap
        Map<String, Integer> sortedMap = new TreeMap<>(map);

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
