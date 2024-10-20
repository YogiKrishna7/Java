import java.util.Scanner;

public class ResAndCustMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant m1 = new Restaurant();
        m1.setMenu();

        Customer c1 = new Customer();
        int choice;

        do {
            System.out.println("\n--- Restaurant Menu ---");
            System.out.println("1. View Menu");
            System.out.println("2. Place an Order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    m1.viewMenu();
                    break;
                case 2:
                    m1.viewMenu();
                    c1.order(m1);
                    break;
                case 3:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        input.close();
    }
}
