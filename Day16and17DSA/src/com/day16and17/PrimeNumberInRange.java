package com.day16and17;

public class PrimeNumberInRange {


        public static void main(String[] args) {
            int startRange = 0;
            int endRange = 1000;

            System.out.println("Prime numbers in the range of " + startRange + " to " + endRange + ":");
            findPrimeNumbers(startRange, endRange);
        }

        // Function to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

        // Function to find and print prime numbers in a given range
        public static void findPrimeNumbers(int start, int end) {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
    }

