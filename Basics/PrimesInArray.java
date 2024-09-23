public class PrimesInArray {

    public static void main(String[] args) {
        // Create an array of numbers to check for primality
        int a[] = {1, 3, 5, 6, 7, 9};

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Assume the current element is prime until proven otherwise
            boolean isPrime = true;

            // Check if the current element is divisible by any previous element
            // (excluding 1)
            for (int j = 0; j < i; j++) {
                if (a[i] % a[j] == 0 && a[j] != 1) {
                    // If divisible, it's not prime
                    isPrime = false;
                    break; // No need to check further
                }
            }

            // If the element remains prime after checking, print it
            if (isPrime) {
                System.out.println(a[i] + " is a prime number");
            }
        }
    }
}