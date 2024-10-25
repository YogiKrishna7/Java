import java.util.*;

class Dish {
    String name;
    int price;
    int num;

    Dish(int num, String name, int price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }
}

class Restaurant {

    Scanner input = new Scanner(System.in);
    Dish menu[];

    void setMenu() {
        System.out.print("How many dishes to add: ");
        int noOfdishes = input.nextInt();
        input.nextLine();

        menu = new Dish[noOfdishes];

        for (int i = 0; i < menu.length; i++) {
            System.out.print("Dish number: ");
            int dishnum = input.nextInt();
            input.nextLine();
            System.out.print("Enter Dish name: ");
            String dn = input.nextLine();
            System.out.print("Enter Dish price: ");
            int dp = input.nextInt();
            input.nextLine();

            menu[i] = new Dish(dishnum, dn, dp);
        }
    }

    void viewMenu() {
        System.out.println("Restaurant Menu:");
        for (Dish dish : menu) {
            System.out.println(dish.num + ") " + "Name: " + dish.name + " Price: " +
                    dish.price);
        }
    }
}

class Customer {
    Scanner input = new Scanner(System.in);

    int quantity;

    void order(Restaurant r) {

        System.out.print("Enter the number of the dish you want to order: ");
        int dishNumber = input.nextInt();

        for (Dish dish : r.menu) {
            if (dishNumber == dish.num) {
                System.out.println(dish.name);
                System.out.print("Enter the quantity: ");
                quantity = input.nextInt();
                System.out.println("Order:");
                System.out.println("Name: " + dish.name + " Quantity: " + quantity);
                System.out.println("Total: " + dish.price * quantity);
            }
        }
    }

}

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