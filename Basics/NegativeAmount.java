
class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }

}

public class NegativeAmount {

    void WithDraw(int amount) throws NegativeAmountException {
        int accBal = 10000;

        if (amount <= 0) {
            throw new NegativeAmountException("Cant Withdraw Zero or Negative Amount");
        } else {
            if (amount > accBal) {
                System.out.println("Insufficent Account Balance");
            } else {
                accBal -= amount;
                System.out.println("Account Bal After Withdraw: " + accBal);
            }
        }

    }

    public static void main(String[] args) {
        NegativeAmount ob1 = new NegativeAmount();
        try {
            ob1.WithDraw(1000);
        } catch (NegativeAmountException e) {
            System.out.println(e);
        }

    }
}
