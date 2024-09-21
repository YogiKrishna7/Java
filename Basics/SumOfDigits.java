public class SumOfDigits {

    public static void main(String[] args) {
        int num = 48; // Number to calculate the sum of digits for

        int sum = 0; // Initialize the sum to 0

        // Iterate while the number is not 0
        while (num != 0) {
            // Extract the last digit using modulo 10
            int digit = num % 10;

            // Add the extracted digit to the sum
            sum += digit;

            // Remove the last digit from the number using integer division
            num /= 10;
        }

        // Print the final sum
        System.out.println("Sum of digits: " + sum);
    }
}