import java.util.*;

public class Customer extends Restaurant {
    Map<String, Integer> order = new HashMap<>();

    public void displayMenu() {
        super.viewMenu();
    }

    public void addToCart() {
        while (true) {
            System.out.println("\nWhich item would you like to order/add to cart?");
            String itemToOrder = input.nextLine().toLowerCase();

            if (menu.containsKey(itemToOrder)) {
                System.out.print("Enter Quantity: ");
                int itemQuantity = input.nextInt();
                input.nextLine();
                order.put(itemToOrder, itemQuantity);
                System.out.println("\nItem added to cart successfully.");
            } else {
                System.out.println("\nItem not available.");
            }

            System.out.print("\nDo you want to add more items? (yes/no): ");
            String addMore = input.nextLine().toLowerCase();

            if (addMore.equals("no")) {
                break;
            }
        }
    }

    public void removeFromCart() {
        System.out.print("\nWhich item to remove from cart?: ");
        String itemToRemove = input.nextLine().toLowerCase();

        if (order.containsKey(itemToRemove)) {
            order.remove(itemToRemove);
            System.out.println("\nItem removed from cart successfully.");
        } else {
            System.out.println("\nItem not available.");
        }
    }

    public void updateCart() {
        System.out.print("\nWhich item to update in cart?: ");
        String itemToUpdate = input.nextLine().toLowerCase();

        if (order.containsKey(itemToUpdate)) {
            System.out.println("Item: " + itemToUpdate + "\nQuantity: " + order.get(itemToUpdate));
            System.out.print("Change Item Quantity: ");
            int changeQuantity = input.nextInt();

            if (changeQuantity > 0) {
                order.put(itemToUpdate, changeQuantity);
                System.out.println("\nUpdated quantity of " + itemToUpdate + " to " + changeQuantity);
            } else {
                order.remove(itemToUpdate);
                System.out.println("\nItem removed from cart.");
            }
        } else {
            System.out.println("\nItem not found in cart.");
        }
    }

    public void viewCart() {
        if (order.isEmpty()) {
            System.out.println("\nCart is empty.");
        } else {
            System.out.println("\nItems in cart:");
            order.forEach((k, v) -> {
                System.out.println("Item Name: " + k + "\nItem Price: " + menu.get(k) + "\nQuantity: " + v + "\nTotal: "
                        + (menu.get(k) * v) + "\n");
            });
        }
    }

    public void payBill() {
        if (order.isEmpty()) {
            System.out.println("\nAdd items to cart first!");
        } else {
            int totalBill = 0;
            System.out.println("\nYour Cart:");

            Set<String> s = order.keySet();
            for (String itemName : s) {
                int quantity = order.get(itemName);
                int itemPrice = menu.get(itemName);
                int itemTotal = itemPrice * quantity;

                totalBill += itemTotal;
                System.out.println("Item Name: " + itemName + "\tItem Price: " + itemPrice + "\tQuantity: " + quantity
                        + "\tTotal: " + itemTotal);
            }
            System.out.println("\nTotal Bill: " + totalBill);

            System.out.print("\nDo you have a coupon code? (yes/no): ");
            String hasCoupon = input.nextLine().toLowerCase();

            if (hasCoupon.equals("yes")) {
                loadCoupons();
                System.out.print("\nEnter coupon code: ");
                String couponCode = input.nextLine().toUpperCase();

                if (coupons.containsKey(couponCode)) {
                    int discount = coupons.get(couponCode);
                    int discountAmount = (totalBill * discount) / 100;
                    totalBill -= discountAmount;
                    System.out.println("\nCoupon applied! You got a " + discount + "% discount.");
                    System.out.println("Discount Amount: " + discountAmount);
                } else {
                    System.out.println("\nInvalid coupon code!");
                }
            } else {
                System.out.println("\nFinal Total Amount: " + totalBill);
            }

            System.out.print("\nProceed With Payment? (yes/no): ");
            String paymentConfirm = input.nextLine().toLowerCase();

            if (paymentConfirm.equals("yes")) {
                System.out.println("\nPayment successful! Thank you for your order.");
                order.clear();
            } else {
                System.out.println("\nPayment canceled.");
            }
        }
    }

    public void view() {
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Add to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Pay Bill");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addToCart();
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    payBill();
                    break;
                case 4:
                    System.out.println("\nExiting customer menu.");
                    return;
                default:
                    System.out.println("\nInvalid option, please try again.");
            }
        }
    }

}
