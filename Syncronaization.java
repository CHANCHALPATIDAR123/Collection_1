package Collection1;

import java.util.*;

class SynchronizedCollectionsExample {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry")));
        Map<String, Integer> map = Collections
                .synchronizedMap(new HashMap<>(Map.of("Apple", 1, "Banana", 2, "Cherry", 3)));

        // Print synchronized collections
        System.out.println("Synchronized list: " + list);
        System.out.println("Synchronized map: " + map);
    }
}
