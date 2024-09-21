public class PrimePalindrome {
    public static void main(String[] args) {
        // Step 1: Define the number to check
        int num = 127;
        int org_num = num; // Keep the original number
        int rev_num = 0;

        // Step 2: Check if the number is a palindrome
        while (num != 0) {
            rev_num = num % 10 + rev_num * 10;
            num = num / 10;
        }

        if (rev_num == org_num) {
            System.out.println(org_num + " is a Palindrome number!");

            // Step 3: Check if the palindrome number is prime
            if (isPrime(org_num)) {
                System.out.println(org_num + " is also a Prime number.");
            } else {
                System.out.println(org_num + " is not a Prime number.");
            }
        } else {
            System.out.println(org_num + " is not a Palindrome number.");
        }
    }

    // Method to check if the number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}