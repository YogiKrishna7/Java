import java.util.Scanner;

public class Calculator {

    static void sum(int num1, int num2) {
        System.out.println("Result: " + (num1 + num2));
    }

    static void sub(int num1, int num2) {
        System.out.println("Result: " + (num1 - num2));
    }

    static void mul(int num1, int num2) {
        System.out.println("Result: " + (num1 * num2));
    }

    static void div(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;

        do {
            System.out.print("Enter 1st Number: ");
            int n1 = input.nextInt();
            System.out.print("Enter 2nd Number: ");
            int n2 = input.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char operand = input.next().charAt(0);

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
            c = input.next().charAt(0);
        } while (c != 'n');

        input.close();
    }
}
