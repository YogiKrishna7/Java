import java.util.Scanner;

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