import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

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

class Res {
    Scanner input = new Scanner(System.in);
    Dish[] menu;

    void setMenu() {
        System.out.print("How many dishes to add: ");
        int noOfdishes = input.nextInt();
        input.nextLine();

        menu = new Dish[noOfdishes];

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Menu.txt"))) {
            System.out.println("Setting menu...");

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
                writer.write(dishnum + "," + dn + "," + dp + "\n");
            }

            System.out.println("Menu Set!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void viewMenu() {
        System.out.println("Restaurant Menu:");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Menu.txt"));
            String words;
            while ((words = reader.readLine()) != null) {
                System.out.println(words);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

class Customer {
    Scanner input = new Scanner(System.in);
    int quantity;

    void order(Res r) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Menu.txt"));
            String line;
            ArrayList<Dish> dishes = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                int number = Integer.parseInt(parts[0]);
                String name = parts[1];
                int price = Integer.parseInt(parts[2]);

                
                Dish dish = new Dish(number, name, price);
                dishes.add(dish);
            }
            reader.close();
            r.menu = dishes.toArray(new Dish[0]);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Dish dish : r.menu) {
            System.out.println(dish.num + ") Name: " + dish.name + " Price: " + dish.price);
        }
        System.out.print("Enter the number of the dish you want to order: ");
        int dishNumber = input.nextInt();

        for (Dish dish : r.menu) {
            if (dishNumber == dish.num) {
                System.out.print("Enter the quantity: ");
                quantity = input.nextInt();
                System.out.println("Order:");
                System.out.println("Name: " + dish.name + " Quantity: " + quantity);
                System.out.println("Total: " + (dish.price * quantity));
                return;
            }
        }
        System.out.println("Dish not found.");
    }
}

public class ResAndCustExtra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Res m1 = new Res();
        Customer c1 = new Customer();

        System.out.println("WELCOME TO 7restaurant");
        System.out.print("Type 1 for Admin or 2 for Customer: ");
        int choice = input.nextInt();
        String AdminPass = "res7";
        if (choice == 1) {
            System.out.print("Enter Password: ");
            String pass = input.next();
            if (pass.equals(AdminPass)) {
                System.out.print("1) Set Menu or 2) View Current Menu: ");
                int adminChoice = input.nextInt();

                if (adminChoice == 1) {
                    m1.setMenu();
                } else if (adminChoice == 2) {
                    m1.viewMenu();
                } else {
                    System.out.println("Enter valid Choice");
                }
            } else {
                System.out.println("Wrong Password!");
            }

        } else if (choice == 2) {
            c1.order(m1);
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }
}
