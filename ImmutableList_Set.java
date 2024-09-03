package Collection1;

import java.util.*;

class ImmutableCollectionsExample {
    public static void main(String[] args) {
        // Create an immutable list
        List<String> list = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry")));
        // Create an immutable set
        Set<String> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry")));
        // Create an immutable map
        Map<String, Integer> map = Collections
                .unmodifiableMap(new HashMap<>(Map.of("Apple", 1, "Banana", 2, "Cherry", 3)));

        // Print immutable collections
        System.out.println("Immutable list: " + list);
        System.out.println("Immutable set: " + set);
        System.out.println("Immutable map: " + map);
    }
}
