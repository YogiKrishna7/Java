public class NumberPrograms {
    public static void main(String[] args) {
        // Swap two numbers
        int num1 = 20;
        int num2 = 10;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        // Fibonacci series
        int n1 = 5;
        int n2 = 6;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 5; i++) {
            int n3 = n1 + n2; // next Fibonacci number
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3 + " ");
        }

        // Reverse a number and check if it's a palindrome
        int originalNum = 158;
        int num = originalNum;
        int reversedNum = 0;
        int sumOfDigits = 0;
        int digitCount = 0;

        while (num != 0) {
            int lastDigit = num % 10; // get last digit
            reversedNum = reversedNum * 10 + lastDigit; // build reversed number
            sumOfDigits += lastDigit; // sum of digits
            digitCount++; // count the digits
            num /= 10; // remove last digit
        }

        System.out.println("Reversed Number: " + reversedNum);
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Number of digits: " + digitCount);

        // Check if the original number is a palindrome
        if (originalNum == reversedNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}