public class SwitchProgram {
    public static void main(String[] args) {
        // Uncomment the following lines to test different parts of the code:
        int index = 4;
        char character = 'A';
        String dayOfWeek = "Mon";

        // Switch statement example
        switch (dayOfWeek) {
            case "Mon":
                System.out.println("Character is a vowel");
                break;
            case "Tue":
                System.out.println("Character is ");
                break;
            default:
                System.out.println("Invalid day");
        }

        // For loop examples
        int sumOfNumbers = 0;
        for (int i = 1; i <= 5; i++) {
            sumOfNumbers += i;
        }
        System.out.println("Sum is " + sumOfNumbers);

        // Multiplication table
        int multiplier = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, multiplier, i * multiplier);
        }

        // Factorial
        int factorial = 1;
        for (int k = 6; k >= 1; k--) {
            factorial *= k;
        }
        System.out.println("Factorial is " + factorial);

        // Even and odd numbers
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;
        int productOfOddNumbers = 1;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i;
                countOfEvenNumbers++;
            } else {
                sumOfOddNumbers += i;
                countOfOddNumbers++;
                productOfOddNumbers *= i;
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
        System.out.println("Count of even numbers: " + countOfEvenNumbers);
        System.out.println("Count of odd numbers: " + countOfOddNumbers);
        System.out.println("Product of odd numbers: " + productOfOddNumbers);

        // Nested for loop example
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }

        int x = 8; // This variable is now used
        switch (90 % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("Secnd");
                break;
            default:
                System.out.println("default");
        }
    }
}