public class Patterns {
    public static void main(String[] args) {
        // Pattern 1: Increasing numbers
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++); // Print increasing numbers and increment k
            }
            System.out.println(); // Move to the next line
        }

        // Pattern 2: Increasing stars
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3: Decreasing stars (inverted triangle)
        for (int j = 5; j >= 1; j--) {
            for (int l = 5; l >= j; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 4: Increasing letters (alphabetical triangle)
        for (int j = 1; j <= 5; j++) {
            char c = 'A';
            for (int x = 1; x <= j; x++) {
                System.out.print(c++); // Print the current letter and increment it
            }
            System.out.println();
        }

        // Pattern 5: Hollow square
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) { // Print the first and last rows with all stars
                System.out.println("******");
                continue; // Skip the rest of the loop to go to the next row
            }
            System.out.print("*"); // Print the first star
            for (int j = 2; j < rows; j++) {
                System.out.print(" "); // Print spaces between stars
            }
            System.out.println("*"); // Print the last star
        }
    }
}