public class TransposeExample {
    public static void main(String[] args) {
        int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] d = {{1, 2, 5}, {4, 5, 7}, {7, 8, 9}};

        // Transpose matrix c and print it
        int[][] transposedC = transpose(c);
        printMatrix(transposedC);

        // Add matrices c and d and print the result
        int[][] sum = addMatrices(c, d);
        printMatrix(sum);

        // Check if matrices c and d are equal
        boolean areEqual = areEqual(c, d);
        if (areEqual) {
            System.out.println("Matrices c and d are equal.");
        } else {
            System.out.println("Matrices c and d are not equal.");
        }
    }

    // Transposes a given matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Adds two matrices of the same size
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Checks if two matrices of the same size are equal
    public static boolean areEqual(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Prints a given matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}