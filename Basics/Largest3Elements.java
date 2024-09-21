
import java.util.Arrays;

public class Largest3Elements {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 4, 3, 1};
        Arrays.sort(arr);

        int sum = 0;
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            sum += arr[i];
        }

        System.out.println("The three largest elements are: " + arr[arr.length - 1] + ", " + arr[arr.length - 2] + ", " + arr[arr.length - 3]);
        System.out.println("Their sum is: " + sum);
    }
}