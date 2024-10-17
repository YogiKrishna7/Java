import java.util.Scanner;
import java.util.ArrayList;

// class Dish {
//     String name;
//     int price;
//     int num;

//     Dish(int num, String name, int price) {
//         this.name = name;
//         this.num = num;
//         this.price = price;
//     }
// }

class Res {

    Scanner input = new Scanner(System.in);
    /* Object Array */
    // Dish menu[];

    /* Arrays */
    String dishList[];
    int priceList[];
    int numList[];

    /* ArrayList */
    // ArrayList<Integer> nlist;
    // ArrayList<String> dlist;
    // ArrayList<Integer> plist;

    void setMenu() {
        System.out.print("How many dishes to add: ");
        int noOfdishes = input.nextInt();
        input.nextLine();

        // menu = new Dish[noOfdishes];

        numList = new int[noOfdishes];
        dishList = new String[noOfdishes];
        priceList = new int[noOfdishes];

        // nlist = new ArrayList<>(noOfdishes);
        // dlist = new ArrayList<>(noOfdishes);
        // plist = new ArrayList<>(noOfdishes);

        // for (int i = 0; i < menu.length; i++) {
        // System.out.print("Dish number: ");
        // int dishnum = input.nextInt();
        // input.nextLine();
        // System.out.print("Enter Dish name: ");
        // String dn = input.nextLine();
        // System.out.print("Enter Dish price: ");
        // int dp = input.nextInt();
        // input.nextLine();

        // menu[i] = new Dish(dishnum, dn, dp);
        // }

        for (int i = 0; i < dishList.length; i++) {
            System.out.print("Dish number: ");
            this.numList[i] = input.nextInt();
            input.nextLine();
            System.out.print("Enter Dish name: ");
            this.dishList[i] = input.nextLine();
            System.out.print("Enter Dish price: ");
            this.priceList[i] = input.nextInt();
            input.nextLine();
        }

        // for (int i = 0; i < noOfdishes; i++) {
        // System.out.print("Dish number: ");
        // int dishnum = input.nextInt();
        // input.nextLine();
        // System.out.print("Enter Dish name: ");
        // String dishname = input.nextLine();
        // System.out.print("Enter Dish price: ");
        // int dishprice = input.nextInt();
        // input.nextLine();

        // nlist.add(dishnum);
        // dlist.add(dishname);
        // plist.add(dishprice);
        // }
    }

    // void viewMenu() {
    // System.out.println("Restaurant Menu:");
    // for (Dish dish : menu) {
    // System.out.println(dish.num + ") " + "Name: " + dish.name + " Price: " +
    // dish.price);
    // }
    // }

    void viewMenu() {
        System.out.println("Restaurant Menu:");
        for (int i = 0; i < dishList.length; i++) {
            System.out.println(numList[i] + ") " + "Name: " + dishList[i] + "Price: " + priceList[i]);
        }
    }

    // void viewMenu() {
    // System.out.println("Restaurant Menu:");
    // for(int i = 0; i < dlist.size(); i++){
    // System.out.println(nlist.get(i) + ") " + "Name: " + dlist.get(i) + "Price: "
    // + plist.get(i));
    // }
    // }
}

class Customer {
    Scanner input = new Scanner(System.in);

    int quantity;

    // void order(Dish[] menu) {

    // System.out.print("Enter the number of the dish you want to order: ");
    // int dishNumber = input.nextInt();

    // for (Dish dish : menu) {
    // if (dishNumber == dish.num) {
    // System.out.println(dish.name);
    // System.out.print("Enter the quantity: ");
    // quantity = input.nextInt();
    // System.out.println("Order:");
    // System.out.println("Name: " + dish.name + " Quantity: " + quantity);
    // System.out.println("Total: " + dish.price * quantity);
    // }
    // }
    // }

    void order(Res r) {
        System.out.print("Enter the number of the dish you want to order: ");
        int dishNumber = input.nextInt();

        for (int i = 0; i < r.dishList.length; i++) {
            if (dishNumber == r.numList[i]) {
                System.out.println(r.dishList[i]);
                System.out.print("Enter the quantity: ");
                quantity = input.nextInt();
                System.out.println("Order:");
                System.out.println("Name: " + r.dishList[i] + " Quantity: " + quantity);
                System.out.println("Total: " + r.priceList[i] * quantity);
            }
        }
    }

    // void order(Res r) {
    // System.out.print("Enter the number of the dish you want to order: ");
    // int dishNumber = input.nextInt();

    // for (int i = 0; i < r.dlist.size(); i++) {
    // if (r.nlist.get(i) == dishNumber) {
    // System.out.println(r.dlist.get(i));
    // System.out.print("Enter the quantity: ");
    // quantity = input.nextInt();
    // System.out.println("Order:");
    // System.out.println("Name: " + r.dlist.get(i) + " Quantity: " + quantity);
    // System.out.println("Total: " + r.plist.get(i) * quantity);
    // }
    // }
    // }
}

public class ResAndCust {
    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        
        Res m1 = new Res();
        m1.setMenu();
        m1.viewMenu();

        Customer c1 = new Customer();
        c1.order(m1);

    }
}
