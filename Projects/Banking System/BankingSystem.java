import java.util.Scanner;

public class BankingSystem {

    static AccountDetails[] acNames;
    static Scanner input = new Scanner(System.in);

    public static void addAccounts() {
        System.out.print("Enter how many accounts that you want to add: ");
        int noOfAccounts = input.nextInt();

        acNames = new AccountDetails[noOfAccounts];

        for (int i = 0; i < noOfAccounts; i++) {
            System.out.println("Enter Details for account " + (i + 1) + ": ");

            System.out.print("Enter Account Name: ");
            String name = input.next();

            System.out.print("Enter Account Number: ");
            String acNumber = input.next();

            System.out.print("Enter Account Balance: ");
            double bal = input.nextDouble();

            acNames[i] = new AccountDetails(name, acNumber, bal);

            System.out.println();
        }

        System.out.println("\nAccounts added successfully!");
    }

    public static void showAccounts() {
        System.out.println("\nAccount Details:");
        for (AccountDetails account : acNames) {
            System.out.println("Account Name: " + account.getAccountName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBal());
            System.out.println();
        }
    }

    public static void searchAccount() {
        System.out.println("Enter Account Number: ");
        String acNo = input.next();

        for (int i = 0; i < acNames.length; i++) {
            if (acNo.equals(acNames[i].getAccountNumber())) {
                System.out.println("Account Name: " + acNames[i].getAccountName());
                System.out.println("Account Number: " + acNames[i].getAccountNumber());
                System.out.println("Balance: " + acNames[i].getBal());
                System.out.println();
                return;
            }
        }
        System.out.println("Account Not Found!");
    }
}
