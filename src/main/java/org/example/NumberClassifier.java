package org.example;

public class NumberClassifier {

    private static final int EVEN_DIVISOR = 2;

    /**
     * Returns the classification of a number: positive even, positive odd, negative even,
     * negative odd, or zero.
     * @param number The number to classify.
     * @return A string representing the classification.
     */
    public String getNumberClassification(int number) {
        if (number == 0) {
            return "Zero";
        }
        if (isEven(number)) {
            return number > 0 ? "Positive Even" : "Negative Even";
        }
        return number > 0 ? "Positive Odd" : "Negative Odd";
    }

    /**
     * Checks if a number is prime.
     * @param number The number to check.
     * @return True if the number is prime, false otherwise.
     */
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

    /**
     * Checks if a number is even.
     * @param number The number to check.
     * @return True if the number is even, false otherwise.
     */
    private boolean isEven(int number) {
        return number % EVEN_DIVISOR == 0;
    }
}