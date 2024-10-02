
import java.util.Scanner;

class AccountDetails {

    Scanner input = new Scanner(System.in);

    private String AccountName;
    private String AccountNumber;
    private double balance;

    public AccountDetails(String Aname, String Anumber, double bal) {
        this.AccountName = Aname;
        this.AccountNumber = Anumber;
        this.balance = bal;
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBal() {
        return balance;
    }

    public void deposit() {
        System.out.print("How Much you want to deposit?: ");
        double depositAmount = input.nextDouble();
        if (depositAmount <= 0) {
            System.out.print("Can't Deposit 0 or Negative Amount!");
        } else {
            balance = balance + depositAmount;
            System.out.println("Deposited: " + depositAmount);
            System.out.println("Total Balance: " + balance);
        }
    }

    public void withdraw() {
        System.out.print("How Much you want to Withdraw?: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount <= 0) {
            System.out.print("Can't Withdraw 0 or Negative Amount!");
        } else if (withdrawAmount > balance) {
            System.out.print("Insufficient balance to withdrawal!");
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Balance: " + balance);
            System.out.println("Total Balance: " + balance);

        }
    }
}

public class BankingSystem {

    static AccountDetails[] acNames;
    static Scanner input = new Scanner(System.in);

    static void addAccounts() {
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

    static void showAccounts() {
        System.out.println("\nAccount Details:");
        for (AccountDetails account : acNames) {
            System.out.println("Account Name: " + account.getAccountName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBal());
            System.out.println();
        }
    }

    static void searchAccount() {

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

    public static void main(String[] args) {
        System.out.println("Banking Menu: ");
        System.out.println("1) Add Accounts");
        System.out.println("2) Show All Accounts");
        System.out.println("3) Search Accounts");
        System.out.println("4) Deposit Amount");
        System.out.println("5) Withdraw Amount");
        System.out.println("6) Exit");
        System.out.println("\n");

        boolean exit = false;
        while (exit == false) {
            System.out.println("Enter a choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addAccounts();
                    break;
                case 2:
                    showAccounts();
                    break;
                case 3:
                    searchAccount();
                    break;
                case 4:
                    if (acNames == null || acNames.length == 0) {
                        System.out.println("No accounts have been added yet!");
                    } else {
                        System.out.print("Enter Account Number: ");
                        String acNo = input.next();
                        for (AccountDetails account : acNames) {
                            if (acNo.equals(account.getAccountNumber())) {
                                account.deposit();
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    if (acNames == null || acNames.length == 0) {
                        System.out.println("No accounts have been added yet!");
                    } else {
                        System.out.print("Enter Account Number: ");
                        String acNo1 = input.next();
                        for (AccountDetails account : acNames) {
                            if (acNo1.equals(account.getAccountNumber())) {
                                account.withdraw();
                                break;
                            }
                        }
                    }

                    break;
                case 6:
                    System.out.println("Exiting The System!");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
