
public class HappyNumber {

    public static void main(String[] args) {
        int num = 16;
        int org_num = num;

        for (int i = 0; i < num; i++) {

            int digit1 = num % 10;
            int digit2 = num / 10;

            int sq1 = digit1 * digit1;
            int sq2 = digit2 * digit2;

            int sumOfSqrs = sq1 + sq2;

            num = sumOfSqrs;

            if (num == 1) {
                System.out.println(org_num + " is a happy number!");
            }
        }
        System.out.println(org_num + " is not a happy number!");
    }
}
