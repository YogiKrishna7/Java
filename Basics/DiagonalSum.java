

import java.util.*;

public class DiagonalSum {

    public static void main(String[] args) {
        // No need for Scanner here, using Random for random numbers
        Random ran = new Random();

        int[][] a = new int[3][3];
        int diagonalSum = 0;
        int columnSum = 0;

        // Generate random numbers between 1 and 9 (inclusive)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = ran.nextInt(1, 10);
            }
        }

        // Print the 2D array
        System.out.println("The Array:");
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        }

        // Calculate diagonal sum (assuming a square matrix)
        for (int i = 0; i < a.length; i++) {
            diagonalSum += a[i][i]; // Add elements on the principal diagonal
        }

        // Calculate column sum (for the first column)
        for (int l = 0; l < a.length; l++) {
            columnSum += a[l][0]; // Add elements in the first column
        }

        System.out.println("Diagonal Values sum: " + diagonalSum);
        System.out.println("The first column sum is: " + columnSum);
    }
}