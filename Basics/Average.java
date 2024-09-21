

public class Average {

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int sum = 0; // Initialize the sum to 0
        int count = 0; // Initialize the count to 0

        // Calculate the sum and count of elements
        for (int i = 0; i < a.length; i++) {
            sum += a[i]; // Add the current element to the sum
            count++; // Increment the count
        }

        // Calculate the average
        int average = sum / count;

        // Print the average
        System.out.println("Average value is: " + average);
    }
}