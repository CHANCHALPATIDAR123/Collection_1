package Coiiection.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NonReptedeWord {

    public static void Main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("neha");
        s.add("neha");
        s.add("gita");
        s.add("ravina");
        s.add("ravina");

        Map<String, Integer> words = new HashMap<>();

        for (String word : s) {
            words.put(word, words.getOrDefault(words, 0) + 1);
        }
        for (String word : s) {
            if (words.get(word) == 1) {
                System.out.println("The first non-repeated word is: " + word);
                return; // Exit the program after finding the first non-repeated word
            }
        }
    }
}
