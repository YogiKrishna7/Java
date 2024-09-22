public class PairsOfElements {

    public static void main(String[] args) {
        int[] a = {15, 12, 4, 16, 9, 8, 24, 0, 24};
        int target = 24;

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Iterate through the remaining elements, starting from the next element
            for (int j = i + 1; j < a.length; j++) {
                // Check if the sum of the current elements equals the target
                if (a[i] + a[j] == target && i != j) {
                    // Print the pair of elements that adds up to the target
                    System.out.println("(" + a[i] + " " + a[j] + ")");
                }
                // Skip duplicate elements to avoid redundant pairs
                else if (a[i] == a[j]) {
                    break;
                }
            }
        }
    }
}