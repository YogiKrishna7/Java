public class StrongNumber {
    public static void main(String[] args) {
        // Step 1: Define the number to check
        int number = 145;

        // Step 2: Keep a copy of the original number
        int originalNumber = number;

        // Step 3: Initialize a sum variable to store the sum of factorials
        int sum = 0;

        // Step 4: Loop through each digit of the number
        while (number > 0) {
            // Get the last digit
            int digit = number % 10;

            // Calculate factorial of the digit
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i; // Multiply to get factorial
            }

            // Add the factorial of the digit to the sum
            sum += factorial;

            // Remove the last digit of the number
            number = number / 10;
        }

        // Step 5: Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
}