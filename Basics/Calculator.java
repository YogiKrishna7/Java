import java.util.Scanner; // Import the Scanner class for user input

public class Calculator {

    // Static methods for each operation (no return value)
    static void sum(int num1, int num2) {
        System.out.println("Result: " + (num1 + num2)); // Print the sum
    }

    static void sub(int num1, int num2) {
        System.out.println("Result: " + (num1 - num2)); // Print the difference
    }

    static void mul(int num1, int num2) {
        System.out.println("Result: " + (num1 * num2)); // Print the product
    }

    static void div(int num1, int num2) {
        if (num2 != 0) { // Check for division by zero
            System.out.println("Result: " + (num1 / num2)); // Print the quotient
        } else {
            System.out.println("Error: Division by zero is not allowed."); // Handle division by zero
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        char c; // Character variable to store user choice (continue)

        do {
            System.out.print("Enter 1st Number: ");
            int n1 = input.nextInt(); // Get the first number

            System.out.print("Enter 2nd Number: ");
            int n2 = input.nextInt(); // Get the second number

            System.out.print("Enter operator (+, -, *, /): ");
            char operand = input.next().charAt(0); // Get the operator

            switch (operand) {
                case '+':
                    sum(n1, n2);
                    break;
                case '-':
                    sub(n1, n2);
                    break;
                case '*':
                    mul(n1, n2);
                    break;
                case '/':
                    div(n1, n2);
                    break;
                default:
                    System.out.println("Enter a valid operator.");
                    break;
            }

            System.out.print("Do you want to continue (y/n)? ");
            c = input.next().charAt(0); // Get user choice for continuing

        } while (c != 'n'); // Loop continues until user enters 'n'

        input.close(); // Close the Scanner object
    }
}
