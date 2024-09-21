public class RowAndColumnSums {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Calculate and print the sum of each row
        System.out.println("Sum of rows:");
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row sum for row " + i + " is " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println();
        System.out.println("Sum of columns:");
        for (int i = 0; i < a[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < a.length; j++) {
                colSum += a[j][i];
            }
            System.out.println("Column sum for column " + i + " is " + colSum);
        }
    }
}