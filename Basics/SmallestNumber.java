import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();

        int smallest = num1; // Initialize smallest to the first number

        // Find the smallest using a single if-else chain
        if (num2 < smallest) {
            smallest = num2;
        } else if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println(smallest + " is the smallest number!");

        input.close(); // Close the Scanner to release resources
    }
}