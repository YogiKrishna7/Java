import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {22, 21, 24, 66, 77};
        Arrays.sort(arr); // Ensure the array is sorted for binary search

        Scanner input = new Scanner(System.in);
        System.out.print("Type a number that you want to find the index of: ");
        int key = input.nextInt();

        boolean found = false;
        int low = 0;
        int high = arr.length - 1;

        // Binary search loop
        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index

            if (arr[mid] == key) { // Check if the key is found
                System.out.println(key + " is found at index: " + mid);
                found = true;
                break; // Exit the loop if found
            }

            if (arr[mid] > key) { // Key is in the left half
                high = mid - 1;
            } else { // Key is in the right half
                low = mid + 1;
            }
        }

        if (!found) { // If the key is not found
            System.out.println("Value not present in Array!");
        }

        input.close();
    }
}