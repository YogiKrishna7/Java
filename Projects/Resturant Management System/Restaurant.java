import java.util.Scanner;

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