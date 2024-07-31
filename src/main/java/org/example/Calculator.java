package org.example;

public class Calculator {
    // Factorial of a non-negative integer
    public static long factorial(int number) {
        if (number < 0) { // If number less than 0 throw exceptions
            throw new IllegalArgumentException("Number must be non-negative");
        }
        // Logic
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Calculate the binomial coefficient given two numbers
    public static long binomialCoefficient(int num1, int num2) {
        if (num1 < 0 || num2 < 0 || num2 > num1) { // See Exception below for param requirements
            throw new IllegalArgumentException("Invalid parameters: num1 and num2 must be non-negative, and num2 must not exceed num1");
        }
        // Logic (Google was my best friend here)
        if (num2 == 0 || num2 == num1) {
            return 1;
        }
        if (num2 > num1 - num2) {
            num2 = num1 - num2;
        }
        long result = 1;
        for (int i = 0; i < num2; i++) {
            result *= (num1 - i);
            result /= (i + 1);
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5)); // 120
            System.out.println("Binomial coefficient (5, 2): " + binomialCoefficient(5, 2)); // 10
            System.out.println("Binomial coefficient (5, 6): " + binomialCoefficient(5, 6)); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

