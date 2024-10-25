import java.util.*;

public class Operations {
    Customer customer = new Customer();

    void ownerOperations() {
        customer.authenticate();
    }

    void customerOperations() {
        customer.displayMenu();
        customer.view();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operations operations = new Operations();

        while (true) {
            System.out.println("\n--- Welcome ---");
            System.out.println("1. Owner");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    operations.ownerOperations();
                    break;
                case 2:
                    operations.customerOperations();
                    break;
                case 3:
                    System.out.println("\nGoodbye!");
                    return;
                default:
                    System.out.println("\nInvalid option, please try again.");
            }
        }
    }
}
