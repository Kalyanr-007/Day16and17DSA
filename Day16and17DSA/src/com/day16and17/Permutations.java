package com.day16and17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    // Iterative method to generate all permutations of a string
    public static List<String> iterativePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add("");

        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String permutation : permutations) {
                for (int i = 0; i <= permutation.length(); i++) {
                    String newPermutation = permutation.substring(0, i) + c + permutation.substring(i);
                    newPermutations.add(newPermutation);
                }
            }
            permutations = newPermutations;
        }

        return permutations;
    }

    // Recursive method to generate all permutations of a string
    public static List<String> recursivePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        List<String> words = recursivePermutations(remaining);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newPermutation = word.substring(0, i) + firstChar + word.substring(i);
                permutations.add(newPermutation);
            }
        }

        return permutations;
    }

    // Function to check if two lists of strings are equal
    public static boolean areEqualLists(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        return list1.containsAll(list2) && list2.containsAll(list1);
    }

    public static void main(String[] args) {
        String inputString = "abc";

        List<String> iterativeResult = iterativePermutations(inputString);
        List<String> recursiveResult = recursivePermutations(inputString);

        System.out.println("Iterative Permutations: " + iterativeResult);
        System.out.println("Recursive Permutations: " + recursiveResult);

        boolean areEqual = areEqualLists(iterativeResult, recursiveResult);
        System.out.println("Are the lists equal? " + areEqual);
    }
}
