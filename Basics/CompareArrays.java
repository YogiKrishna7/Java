

public class CompareArrays {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean areEqual = true;

        // Iterate through each element of the arrays
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                // If any element is different, set areEqual to false
                if (arr1[i][j] != arr2[i][j]) {
                    areEqual = false;
                    break; // Break out of the inner loop if not equal
                }
            }
        }

        // Print the result
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}