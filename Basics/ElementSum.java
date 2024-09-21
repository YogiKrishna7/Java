public class ElementSum {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 6, 8, 9};

        int sum = 0; // Initialize the sum to 0

        // Iterate through each element of the array and add it to the sum
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        // Print the final sum
        System.out.println("Sum of all elements in Array: " + sum);
    }
}