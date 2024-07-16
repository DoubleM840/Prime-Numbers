//package com.mycompany.primenumberchecker;

/**
 *
 * @author Group A
 */
public class PrimeNumberChecker {

    // Constructor
    public PrimeNumberChecker() {
        // Constructor code if needed
    }

    // Non-static method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to display prime numbers between 1 and 500
    public static void displayPrimes() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        System.out.println("Prime numbers between 1 and 500 are:");
        for (int i = 1; i <= 500; i++) {
            if (checker.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Static main method
    public static void main(String[] args) {
        displayPrimes();
    }
}
