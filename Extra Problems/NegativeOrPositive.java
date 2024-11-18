import java.util.ArrayList;
import java.util.Arrays;

public class NegativeOrPositive {
    public static void main(String[] args) {
        // Initialize the input ArrayList with mixed positive and negative numbers
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(
            -8, 7, -56, -91, 36, 36, 87, -23, 4, 67, -94, -90, 6, 34, -99, -23, -87, -17,
            38, 18, 87, 70, 5, -82, 31, -17, 40, 82, 53, -48, -91, 47, -35, 27, 52, 99,
            -27, -51, 97, 45, 51, 30, -86, 26, 77, -46, -13, 54, -4, -53, -45, -28, -67,
            -3, 80, 82, -88, 81, 1, 3, -36, 98, -1, -47, -82, 90, -86, 0, -23, -45, 83,
            6, -7, 89, -90, 53));

        // Create separate lists for positive and negative numbers
        ArrayList<Integer> posres = new ArrayList<>();
        ArrayList<Integer> negres = new ArrayList<>();

        // Loop through the input list and classify numbers
        for (int i : arr) {
            if (i >= 0) {
                posres.add(i);  // Positive or zero
            } else {
                negres.add(i);  // Negative
            }
        }

        // Output the result: number of positive and negative numbers
        System.out.println(posres.size() + ", " + negres.size());
    }
}
