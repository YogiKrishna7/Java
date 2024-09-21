import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Generate random double values between 0 and 10
        for (int i = 1; i <= 5; i++) {
            double x = Math.random() * 10;
            System.out.println(x);
        }

        // Generate random integer values between 0 and 149
        Random r = new Random();
        int y = r.nextInt(150);
        System.out.println(y);
    }
}