public class FactorialArray {

    public static void main(String[] args) {
        // Create an array of numbers to calculate factorials
        int a[] = {1, 3, 5, 6, 7, 9};

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Initialize the factorial to 1
            int fact = 1;

            // Calculate the factorial of the current element
            for (int j = 1; j <= a[i]; j++) {
                fact *= j;
            }

            // Print the calculated factorial
            System.out.println("Factorial of " + a[i] + " is: " + fact);
        }
    }
}