
import java.util.Scanner;

// Custom exception class for age validation
class AgeNotValidException extends Exception {

    // Constructor to pass the custom exception message
    AgeNotValidException(String message) {
        super(message); // Call the superclass (Exception) constructor with the message
    }

}

public class AgeValidation {

    // Method to validate the user's age
    void validateAge(int age) throws AgeNotValidException {
        // If age is less than 18, throw custom exception
        if (age < 18) {
            throw new AgeNotValidException("You are not allowed to open a bank account");
        } else {
            // If age is 18 or above, allow opening a bank account
            System.out.println("You can open a bank account!");
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age: "); // Prompt user for age
        int ageInput = input.nextInt(); // Store user input

        // Create an instance of CustomException
        AgeValidation ob1 = new AgeValidation();
        try {
            // Call the method to validate the age
            ob1.validateAge(ageInput);
        } catch (AgeNotValidException e) {
            // Catch and handle the custom exception if age is not valid
            System.out.println(e.getMessage()); // Print the exception message
        }
    }
}
