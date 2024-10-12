public class ArraysEvenOddElements {

    public static void main(String[] args) {
        int[] a = {11, 42, 13, 44, 55, 67};

        // Iterate through the array elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element at index " + i + ": " + a[i]);
            System.out.println("Length + index: " + (a.length + i));
            System.out.println("First element: " + a[0]);
            System.out.println("Last element: " + a[a.length - 1]);

            int mid = (a.length - 1) / 2; // Calculate the middle index
            System.out.println("Middle element: " + a[mid]);

            // Check if the current element is even or odd
            if (a[i] % 2 == 0) {
                System.out.println("Number " + a[i] + " is even.");
            } else {
                System.out.println("Number " + a[i] + " is odd.");
            }
        }
    }
}