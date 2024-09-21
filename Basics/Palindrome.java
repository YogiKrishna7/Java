public class Palindrome {
    public static void main(String[] args) {
        // Input number to check
        int num = 127;

        // Store the original number for comparison later
        int orgNum = num;

        // Initialize the reversed number to 0
        int revNum = 0;

        // Reverse the number using a loop
        while (num != 0) {
            // Extract the last digit of the number
            int lastDigit = num % 10;

            // Append the last digit to the reversed number
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from the original number
            num = num / 10;
        }

        // Check if the reversed number is equal to the original number
        if (revNum == orgNum) {
            System.out.println("It's a palindrome number!");
        } else {
            System.out.println("It's not a palindrome number!");
        }
    }
}