

import java.util.Scanner;

public class SpecificValue {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Initialize an array with elements
        boolean found = false; // Initialize a flag to indicate if the value is found

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.print("Enter the number to search in the array: ");
        int targetValue = input.nextInt(); // Get the target value from the user

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Compare the current element with the target value
            if (a[i] == targetValue) {
                found = true; // Set the found flag to true if a match is found
                break; // Exit the loop early if found
            }
        }

        // Check if the value was found
        if (found) {
            System.out.println(String.format("The value %d is found in the array!", targetValue));
        } else {
            System.out.println(String.format("The value %d is not found in the array.", targetValue));
        }

        input.close(); // Close the Scanner to release resources
    }
}