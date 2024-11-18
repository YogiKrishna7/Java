import java.util.*;

public class SmallerOrEqual {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 5, 5));
        int b = 3;

        int count = 0;
        for (int num : A) {
            if (num <= b) {
                count++;
            }
        }

        System.out.println(count);
    }
}
