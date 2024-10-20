import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Banking Menu: ");
        System.out.println("1) Add Accounts");
        System.out.println("2) Show All Accounts");
        System.out.println("3) Search Accounts");
        System.out.println("4) Deposit Amount");
        System.out.println("5) Withdraw Amount");
        System.out.println("6) Exit");
        System.out.println("\n");

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter a choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    BankingSystem.addAccounts();
                    break;
                case 2:
                    BankingSystem.showAccounts();
                    break;
                case 3:
                    BankingSystem.searchAccount();
                    break;
                case 4:
                    if (BankingSystem.acNames == null || BankingSystem.acNames.length == 0) {
                        System.out.println("No accounts have been added yet!");
                    } else {
                        System.out.print("Enter Account Number: ");
                        String acNo = input.next();
                        for (AccountDetails account : BankingSystem.acNames) {
                            if (acNo.equals(account.getAccountNumber())) {
                                account.deposit();
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    if (BankingSystem.acNames == null || BankingSystem.acNames.length == 0) {
                        System.out.println("No accounts have been added yet!");
                    } else {
                        System.out.print("Enter Account Number: ");
                        String acNo1 = input.next();
                        for (AccountDetails account : BankingSystem.acNames) {
                            if (acNo1.equals(account.getAccountNumber())) {
                                try {
                                    account.withdraw();
                                } catch (LessThanZeroException e) {
                                    System.out.println(e.getMessage());
                                }
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
        input.close();
    }
}
