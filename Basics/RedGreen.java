import java.util.Scanner;

public class RedGreen {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the light color
        System.out.println("Enter the traffic light color (Red or Green): ");

        // Read the user input as a String
        String light = sc.next();

        // Check the entered light color
        if (light.equals("Red")) {
            System.out.println("Red signal: Stop!");
        } else if (light.equals("Green")) {
            System.out.println("Green signal: Go!");
        } else {
            // Handle invalid input
            System.out.println("Invalid light color. Please enter 'Red' or 'Green'.");
        }

        // Close the Scanner (optional but good practice)
        sc.close();
    }
}