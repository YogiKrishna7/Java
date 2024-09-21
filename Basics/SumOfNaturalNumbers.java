public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int num = 5; // Number of natural numbers to sum

        int sum = 0;

        // Iterate from 1 to num and add each number to the sum
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Print the final sum
        System.out.println("Sum of natural numbers up to " + num + ": " + sum);
    }
}