
public class OperatorExamples {

    public static void main(String[] args) {

        // Declare variables
        int a = 40;
        int b = 20;
        int c = 10;

        // Arithmetic operations
        int result = a + b;
        int diff = a - b;
        int mul = a * b;
        float div = (float) b / a; // Cast to float for accurate division result

        System.out.println("Addition: " + result);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div); // Display floating-point result

        // Comparison operation
        if (a == c) {
            System.out.println("a is equal to c");
        } else {
            System.out.println("a is not equal to c");
        }

        // Assignment operators (combined for brevity)
        int x = 5;
        x += 5; // x becomes 10 (x = x + 5)
        x -= 2; // x becomes 8 (x = x - 2)
        x *= 3; // x becomes 24 (x = x * 3)
        x /= 6; // x becomes 4 (x = x / 6)
        System.out.println("x after assignment operations: " + x);

        // Unary operator (pre-decrement)
        int y = 6;
        System.out.println("y after pre-decrement: " + (y-- - --y)); // Output: 6 - 4 (decrements y twice)

        // Ternary operator
        char z = (a > b) ? 't' : 'f';
        System.out.println("z (a is greater than b): " + z);

        // Logical operators (commented out as incorrect condition)
        /*
        if (a > b && a > c && a == c) { // This condition is always false
            System.out.println("a is greatest");
        } else {
            System.out.println("a is not greatest");
        }
         */
        // Type casting
        int i = 65;
        char ch = (char) i; // Cast integer to character (prints ASCII value)
        System.out.println("Character equivalent of 65 (ASCII): " + ch);

        // Scanner example (commented out for brevity)
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Entered number: " + num);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Entered character: " + ch);
         */
        // Shift operators
        int ls = 10 << 2; // Left shift by 2 bits (equivalent to multiplying by 4)
        System.out.println("Left shift result: " + ls);
        int rs = 20 >> 2; // Right shift by 2 bits (equivalent to dividing by 4, discarding remainder)
        System.out.println("Right shift result: " + rs);

        // Type casting example (implicit)
        double dtc1 = 40; // Implicit conversion from int to double
        System.out.println("dtc1 (int to double): " + dtc1);

        // Divisibility check (corrected condition)
        int num = 16;
        if (num % 3 == 0 && num % 5 == 0) { // Check for divisibility by both 3 and 5
            System.out.println(num + " is divisible by both 3 and 5");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5");
        }

        // Checking for capital letter
        char ch2 = 'f';
        if (ch2 >= 'A' && ch2 <= 'Z') {
            System.out.println(ch2 + " is a capital letter");
        } else {
            System.out.println(ch2 + " is not a capital letter");
        }

        // Right-Shift Operator:
        int q = 9;
        int p = a >> 2;
        System.out.println(p);
        //tokens (keyword,seperator,operator,literal,coment,identifiers,variables,datatype,class,object)
    }
}
