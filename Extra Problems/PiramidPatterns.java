public class PiramidPatterns {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            System.out.println("* ".repeat(i));      
        }
        for (int i = rows - 1; i >= 1; i--) {
            System.out.print(" ".repeat(rows - i));
            System.out.println("* ".repeat(i));      
        }
    }
}
