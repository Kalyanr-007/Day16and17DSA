package com.day16and17;

public class InsertionSort {

        public static void main(String[] args) {
            // Input array of strings (replace with your list of words)
            String[] words = {"apple", "cherry", "banana", "date", "fig"};

            System.out.println("Original List:");
            printArray(words);

            // Sort the array using Insertion Sort
            insertionSort(words);

            System.out.println("\nSorted List:");
            printArray(words);
        }

        // Insertion Sort implementation
        public static void insertionSort(String[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                String key = arr[i];
                int j = i - 1;

                // Move elements of arr[0..i-1], that are greater than key,
                // to one position ahead of their current position
                while (j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        // Utility function to print an array of strings
        public static void printArray(String[] arr) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }


