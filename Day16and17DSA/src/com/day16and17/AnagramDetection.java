package com.day16and17;


    import java.util.Arrays;

    public class AnagramDetection {

        public static void main(String[] args) {
            // Input two strings (replace with your input)
            String str1 = "abcd";
            String str2 = "dcba";

            // Check if the two strings are anagrams
            boolean areAnagrams = areAnagrams(str1, str2);

            if (areAnagrams) {
                System.out.println("The two strings are anagrams.");
            } else {
                System.out.println("The two strings are not anagrams.");
            }
        }

        // Function to check if two strings are anagrams
        public static boolean areAnagrams(String str1, String str2) {
            // Remove spaces and convert to lowercase for case-insensitive comparison
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if the lengths are equal
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to character arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted character arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }


