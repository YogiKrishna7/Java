public class WhileLoop {
    public static void main(String[] args) {
        // Initialize variables
        int i = 0;
        int j = 10;
        int sum = 0;

        // Calculate the sum of even numbers from 0 to 10
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i; // Add even number to the sum
            }
            i++;
        }
        System.out.println("Sum of even numbers from 0 to 10: " + sum);

        // Count down from 10 to 1
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
    }
}