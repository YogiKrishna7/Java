public class DigitsOfNumber {

    public static void main(String[] args) {
        int num = 32145;

        // Convert the number to a string to extract individual digits
        String numString = String.valueOf(num);

        // Iterate through each character of the string
        for (int i = 0; i < numString.length(); i++) {
            // Extract the digit at the current index
            char digit = numString.charAt(i);

            // Print the digit
            System.out.println(digit);
        }
    }
}