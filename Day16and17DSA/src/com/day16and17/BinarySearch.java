package com.day16and17;


    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;

    public class BinarySearch {

        public static void main(String[] args) {
            try {
                // Read the list of words from a file (replace "words.txt" with your file path)
                BufferedReader br = new BufferedReader(new FileReader("New Microsoft Word Document.docx"));
                String wordsLine = br.readLine();
                br.close();

                // Split the words into an array
                String[] wordArray = wordsLine.split(",");

                // Sort the word array
                Arrays.sort(wordArray);

                // Prompt the user to enter a word to search
                String searchWord = getUserInput("Enter a word to search: ");

                // Perform binary search
                boolean found = binarySearch(wordArray, searchWord);

                // Print the result
                if (found) {
                    System.out.println(searchWord + " is found in the list.");
                } else {
                    System.out.println(searchWord + " is not found in the list.");
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }

        // Function to perform binary search on a sorted array
        public static boolean binarySearch(String[] array, String target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int comparison = target.compareTo(array[mid]);

                if (comparison == 0) {
                    return true; // Found the target word
                } else if (comparison < 0) {
                    right = mid - 1; // Target word is in the left half
                } else {
                    left = mid + 1; // Target word is in the right half
                }
            }

            return false; // Target word is not in the array
        }

        // Function to get user input
        public static String getUserInput(String prompt) throws IOException {
            System.out.print(prompt);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }
    }

