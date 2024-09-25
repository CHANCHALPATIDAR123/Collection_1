package Coiiection.HashMap;

import java.util.HashSet;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = { 1, 3, 5, 7, 9, 3, 1, 8, 5, 7 };

        // Set to keep track of seen numbers
        HashSet<Integer> seenNumbers = new HashSet<>();
        // Set to store duplicates
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate through the array
        for (int number : numbers) {
            // Check if the number has already been seen
            if (seenNumbers.contains(number)) {
                // If the number is already seen, add it to duplicates
                duplicates.add(number);
            } else {
                // If it's the first time seeing the number, add it to seenNumbers
                seenNumbers.add(number);
            }
        }

        // Print the duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }
}
