import java.util.Scanner;

class Dish {
    String Dish;
    int DishPrice;
    int DishNum;

    Dish(int num, String Dish, int DishPrice) {
        this.Dish = Dish;
        this.DishPrice = DishPrice;
        this.DishNum = num;
    }
}

class Res {

    Dish menu[];
    Scanner input = new Scanner(System.in);

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
            System.out.println(dish.DishNum + ") " + "Name: " + dish.Dish + " Price: " + dish.DishPrice);
        }
    }
}

class Customer {
    Scanner input = new Scanner(System.in);

    int quantity;

    void order(Dish[] menu) {

        System.out.print("Enter the number of the dish you want to order: ");
        int dishNumber = input.nextInt();

        for (Dish dish : menu) {
            if (dishNumber == dish.DishNum) {
                System.out.println(dish.Dish);
                System.out.print("Enter the quantity: ");
                quantity = input.nextInt();
                System.out.println("Order:");
                System.out.println("Name: " + dish.Dish + " Quantity: " + quantity);
                System.out.println("Total: " + dish.DishPrice * quantity);
            }
        }
    }
}

public class ResAndCust {
    public static void main(String[] args) {
        Res m1 = new Res();
        m1.setMenu();
        m1.viewMenu();

        Customer c1 = new Customer();
        c1.order(m1.menu);
    }
}
