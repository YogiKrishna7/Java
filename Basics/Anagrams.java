
import java.util.Arrays;

public class Anagrams {

    // Checks if two strings are anagrams.
    public static void main(String[] args) {
        String a = "keep";
        String b = "peek";

        // Print the lengths of the strings for debugging
        System.out.println("Length of a: " + a.length());
        System.out.println("Length of b: " + b.length());

        // Check if the lengths are equal
        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
        } else {
            // Convert strings to character arrays
            char aChar[] = a.toCharArray();
            char bChar[] = b.toCharArray();

            // Sort the character arrays
            Arrays.sort(aChar);
            Arrays.sort(bChar);

            // Check if the sorted arrays are equal
            boolean isAnagram = Arrays.equals(aChar, bChar);
            if (isAnagram) {
                System.out.println("Anagram!");
            } else {
                System.out.println("Not an Anagram!");
            }
        }
    }
}
