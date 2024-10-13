/* 
8) Write a Java program to create a class called "BankAccount" with attributes for account
number, account holder's name, and balance. Include methods for depositing and
withdrawing money, as well as checking the balance. Create a subclass called
"SavingsAccount" that adds an interest rate attribute and a method to apply interest. 
*/

class BankAccount {

    String accountNumber;
    String accountName;
    int balance;

    public BankAccount(String accountNumber, String accountName, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount Cant Be Zero or Negative!");
        } else if (amount > balance) {
            System.out.println("Insufficent Amount!");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
            System.out.println("New Balance: " + balance);
        }
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Amount Cant Be Zero or Negative!");

        }
    }

    void checkBalance() {
        System.out.println("Your Account Balance is: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(String accountNumber, String accountName, int balance, double interestRate) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interestAmount = balance * (interestRate / 100);
        balance += interestAmount;
        System.out.println("Interest applied: " + interestAmount);
        System.out.println("New balance after applying interest: " + balance);
    }
}

public class Program8 {

    public static void main(String[] args) {
        BankAccount p1 = new BankAccount("Yogi", "1234567", 10000);
        p1.checkBalance();

        SavingsAccount p2 = new SavingsAccount("7654321", "Yogendra", 1000, 2.70);
        p2.checkBalance();

        BankAccount p3 = new SavingsAccount("21412421412", "Yogendra", 10000, 2.70);
        p3.checkBalance();
    }
}
