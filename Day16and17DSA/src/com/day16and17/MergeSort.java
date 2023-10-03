package com.day16and17;
import java.util.Arrays;
public class MergeSort {




        public static void main(String[] args) {
            // Input list of strings (replace with your list of strings)
            String[] strings = {"apple", "cat", "dog", "ball", "fish"};

            System.out.println("Original List:");
            printArray(strings);

            // Sort the list using Merge Sort
            mergeSort(strings);

            System.out.println("\nSorted List:");
            printArray(strings);
        }

        // Merge Sort implementation for an array of strings
        public static void mergeSort(String[] arr) {
            int n = arr.length;
            if (n < 2) {
                return; // Base case: If the array has 0 or 1 elements, it's already sorted.
            }

            int mid = n / 2;
            String[] left = Arrays.copyOfRange(arr, 0, mid);
            String[] right = Arrays.copyOfRange(arr, mid, n);

            // Recursively sort the two halves
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(arr, left, right);
        }

        // Merge two sorted arrays into one sorted array
        public static void merge(String[] arr, String[] left, String[] right) {
            int n1 = left.length;
            int n2 = right.length;
            int i = 0, j = 0, k = 0;

            while (i < n1 && j < n2) {
                if (left[i].compareTo(right[j]) <= 0) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < n1) {
                arr[k++] = left[i++];
            }

            while (j < n2) {
                arr[k++] = right[j++];
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


