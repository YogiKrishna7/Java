

public class MissingElement {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 5, 6, 7};

        int high = ar[ar.length - 1];
        int sum = 0;
        int total;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        total = high * (high + 1) / 2;

        System.out.println("Missing Value is: " + (total - sum));
    }
}