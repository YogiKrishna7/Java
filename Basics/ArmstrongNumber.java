public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153; // Replace with your desired number
        int originalNumber = num; // Store the original number for comparison
        int digits;
        int sumOfPowers = 0;

        // Calculate the sum of powers of individual digits
        while (num != 0) {
            digits = num % 10; // Extract the last digit
            sumOfPowers += Math.pow(digits, 3); // Add the cube of the digit to the sum
            num = num / 10; // Remove the last digit from the number
        }

        // Check if the sum of powers equals the original number
        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number!");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number!!");
        }
    }
}