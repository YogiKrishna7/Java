
import java.util.Scanner;

public class ArrayStatistics { 
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare an array to store 3 integers
        int[] a = new int[3];

        // Get input from the user for the array elements
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            a[i] = input.nextInt();
        }

        // Close the Scanner object after use
        input.close();

        // Variables to store even and odd number sums and counts
        int evenSum = 0;
        int oddSum = 0;
        int countEven = 0;
        int countOdd = 0;

        // Calculate sum and count of even and odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];  // Corrected the calculation for evenSum
                countEven++;
            } else {
                oddSum += a[i];
                countOdd++;
            }
        }

        // Display the results
        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        // Search for a specific element (key) in the array
        int key = 66;
        int flag = 0;
        int i;

        for (i = 0; i < a.length; i++) {
            if (a[i] == key) {
                flag++;
                break;
            }
        }

        if (flag >= 1) {
            System.out.println("The number found at index: " + i);
        } else {
            System.out.println("Element not found");
        }
    }
}
