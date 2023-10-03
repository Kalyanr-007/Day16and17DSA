package com.day16and17;


    public class BubbleSort {

        public static void main(String[] args) {
            // Input array of integers (replace with your list of integers)
            int[] ints = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original List:");
            printArray(ints);

            // Sort the array using Bubble Sort
            bubbleSort(ints);

            System.out.println("\nSorted List:");
            printArray(ints);
        }

        // Bubble Sort implementation
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no two elements were swapped in inner loop, the array is already sorted
                if (!swapped) {
                    break;
                }
            }
        }

        // Utility function to print an array of integers
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


