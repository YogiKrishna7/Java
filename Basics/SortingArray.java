
import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 3};

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(a);

        // Print the sorted array in descending order
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}