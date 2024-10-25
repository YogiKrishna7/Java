import java.util.*;

public class Restaurant {
    Scanner input = new Scanner(System.in);
    Map<String, Integer> menu = new HashMap<>();

    public void addToMenu() {
        System.out.print("How many items to add?: ");
        int noOfItems = input.nextInt();
        input.nextLine();

        for (int i = 0; i < noOfItems; i++) {
            System.out.println("\nEnter Item " + (i + 1));

            System.out.print("Enter Name: ");
            String name = input.nextLine().toLowerCase();

            System.out.print("Enter Price: ");
            int price = input.nextInt();
            input.nextLine();
            menu.put(name, price);
        }
    }

    public void deleteItem() {
        System.out.print("\nItem to delete: ");
        String itemToDelete = input.nextLine().toLowerCase();

        if (menu.containsKey(itemToDelete)) {
            menu.remove(itemToDelete);
            System.out.println("\nItem Removed!");
        } else {
            System.out.println("\nItem not found");
        }
    }

    public void updateItemPrice() {
        System.out.print("\nItem to update price for: ");
        String itemToUpdate = input.nextLine().toLowerCase();

        if (menu.containsKey(itemToUpdate)) {
            System.out.print("Enter new price: ");
            int newPrice = input.nextInt();
            input.nextLine();
            menu.replace(itemToUpdate, newPrice);
            System.out.println("\nPrice Updated!");
        } else {
            System.out.println("\nItem not found!");
        }
    }

    public void viewMenu() {
        System.out.println("\nToday's Menu: ");
        menu.forEach((n, p) -> System.out.println(n + " -> " + p));
    }

    Map<String, Integer> coupons = new HashMap<>();

    public void loadCoupons() {
        coupons.put("SAVE10", 10);
        coupons.put("SAVE20", 20);
        coupons.put("FLAT50", 50);
    }

    public void authenticate() {
        Map<String, String> usernameAndPassword = new HashMap<>();
        usernameAndPassword.put("yogi", "yogi@2002");
        usernameAndPassword.put("prasad", "prasad@2003");

        System.out.println("=== Restaurant Management System ===\n");

        System.out.print("Enter Your Username: ");
        String username = input.nextLine();

        System.out.print("Enter Your Password: ");
        String password = input.nextLine();
        System.out.println();

        if (usernameAndPassword.containsKey(username) && usernameAndPassword.get(username).equals(password)) {

            while (true) {
                System.out.println("\n--- Admin Menu ---");
                System.out.println("1. Add Menu Item");
                System.out.println("2. View Menu");
                System.out.println("3. Update Item Price");
                System.out.println("4. Delete Menu Item");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        addToMenu();
                        break;
                    case 2:
                        viewMenu();
                        break;
                    case 3:
                        updateItemPrice();
                        break;
                    case 4:
                        deleteItem();
                        break;
                    case 5:
                        System.out.println("\nGoodbye!");
                        return;
                    default:
                        System.out.println("\nInvalid choice, please try again.");
                }
            }

        } else {
            System.out.println("\nInvalid username or password.\n");
        }
    }
}
