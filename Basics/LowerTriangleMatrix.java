import java.util.*;

public class LowerTriangleMatrix {

    public static void main(String[] args) {
        // Random number generation for matrix elements
        Random ran = new Random();

        // Create a 3x3 matrix
        int[][] a = new int[3][3];

        // Fill the matrix with random integers between 1 and 9 (inclusive)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = ran.nextInt(1, 10); // Adjust range as needed (1-9)
            }
        }

        // Print the lower triangular matrix
        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < j) { // Elements below the diagonal are set to 0
                    System.out.print("  0  ");
                } else {
                    System.out.print(" " + a[i][j] + "  ");
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}