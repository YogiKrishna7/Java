

public class PairsOfElements {

    public static void main(String[] args) {
        int[] a = {15, 12, 4, 16, 9, 8, 24, 0, 24};
        int target = 24;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("(" + a[i] + " " + a[j] + ")");
                }
            }
        }
    }
}