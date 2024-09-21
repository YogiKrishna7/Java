import java.util.Scanner;

public class UserInputDoWhile { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice; // More descriptive variable name

        do {
            System.out.println("Enter User ID: ");
            String userID = sc.next();

            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            System.out.println("Enter Password: ");
            String password = sc.next();

            System.out.println("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);

            if (choice != 'y' && choice != 'n') { // Check for valid input
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
            }
        } while (choice == 'y');

        System.out.println("Exiting program.");
        sc.close(); // Close Scanner (optional)
    }
}