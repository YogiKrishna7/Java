public class TwoDimensionalArrayCalculations {

    public static void main(String[] args) {
        // Initialize two 3x3 integer arrays
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Create two more 3x3 integer arrays to store the sum and difference
        int[][] arr3 = new int[3][3];
        int[][] arr4 = new int[3][3];

        // Calculate the sum of arr1 and arr2 and store it in arr3
        System.out.println("Sum of arr1 and arr2:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate the difference of arr1 and arr2 and store it in arr4
        System.out.println("\nDifference of arr1 and arr2:");
        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr1.length; l++) {
                arr4[k][l] = arr1[k][l] - arr2[k][l];
                System.out.print(arr4[k][l] + "\t");
            }
            System.out.println();
        }
    }
}