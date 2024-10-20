import java.util.Scanner;

class LessThanZeroException extends Exception {
    public LessThanZeroException(String n) {
        super(n);
    }
}

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

    public void withdraw() throws LessThanZeroException {
        System.out.print("How Much you want to Withdraw?: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount <= 0) {
            // System.out.print("Can't Withdraw 0 or Negative Amount!");

            throw new LessThanZeroException("Can't Withdraw 0 or Negative Amount!");

        } else if (withdrawAmount > balance) {
            System.out.print("Insufficient balance to withdrawal!");
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Balance: " + balance);
            System.out.println("Total Balance: " + balance);

        }
    }
}
