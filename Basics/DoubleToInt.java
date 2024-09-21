public class DoubleToInt {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 7, 8, 9};

        for (int i = 0; i < nums.length; i++) {
            double x = Math.random() * 10; // Generate a random double between 0 and 10
            int intX = (int) x; // Convert the double to an int
            System.out.println(intX);
        }
    }
}