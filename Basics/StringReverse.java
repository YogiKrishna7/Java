public class StringReverse {

    public static void main(String[] args) {
        String name = "yogi"; // Declare a string variable to store the original string

        String rev_str = ""; // Initialize an empty string to store the reversed string

        // Iterate through the original string from the last character to the first
        for (int i = name.length() - 1; i >= 0; i--) {
            // Append the current character to the reversed string
            rev_str += name.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reverse String: " + rev_str);
    }
}