
public class ReverseNumber {

    public static void main(String[] args) {
        // Step 1: Initialize variables
        int rev = 0; // Stores the reversed number
        int temp = num; // Temporary variable to store the original number
        int num = 232; // The number to be reversed

        // Step 2: Reverse the number
        while (num != 0) {
            int d = num % 10; // Extract the last digit
            rev = rev * 10 + d; // Append the digit to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }

        // Step 3: Check if the reversed number is equal to the original
        if (temp == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }
}
