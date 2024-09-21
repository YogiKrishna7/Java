public class MaxAndMin {
    public static void main(String[] args) {
        // Initialize an array with some sample values
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Initialize `max` and `min` to the first element of the array
        int max = a[0];
        int min = a[0];

        // Loop through the array and update `max` and `min` if necessary
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) { // If the current element is greater than the current maximum
                max = a[i]; // Update the maximum
            } else if (min > a[i]) { // If the current element is less than the current minimum
                min = a[i]; // Update the minimum
            }
        }

        // Print the results
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}