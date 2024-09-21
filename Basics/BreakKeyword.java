public class BreakKeyword {
    public static void main(String[] args) {
        // Break keyword example
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 2 && j == 2) {
                    break; // Terminates the inner loop
                }
                System.out.println(i + " " + j);
            }
        }

        // Continue keyword example
        for (int k = 0; k <= 5; k++) {
            if (k == 3) {
                continue; // Skips the rest of the current iteration
            }
            System.out.println(k);
        }
    }
}