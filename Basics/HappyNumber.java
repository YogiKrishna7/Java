public class HappyNumber {

    public static void main(String[] args) {
        int num = 32;
        int org_num = num;

        while (num != 1 && num != 4) {
            num = sumOfSquares(num);
        }

        if (num == 1) {
            System.out.println(org_num + " is a happy number!");
        } else {
            System.out.println(org_num + " is not a happy number!");
        }
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
