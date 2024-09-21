public class DuplicateValues {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 3, 6, 7, 8, 8};

        // Iterate through each element of the array
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i]; // Store the current element for comparison

            // Check for duplicates in the remaining elements
            for (int j = i + 1; j < a.length; j++) {
                if (currentElement == a[j]) {
                    System.out.println("Duplicate value: " + currentElement);
                    break; // Break out of the inner loop if a duplicate is found
                }
            }
        }
    }
}