public class Vowels {

    public static void main(String[] args) {
        String name = "yogendra";

        // A string containing all vowels
        String vowels = "AEIOUaeiou";

        // Print a message indicating that we're about to find vowels in the name
        System.out.println("Vowels in " + name + " are: ");

        // Iterate through each character in the name
        for (int i = 0; i < name.length(); i++) {
            // Get the current character
            char ch = name.charAt(i);

            // Convert the character to a string for comparison
            String charString = String.valueOf(ch);

            // Check if the character is a vowel
            if (vowels.contains(charString)) {
                // If it's a vowel, print it
                System.out.print(ch + " ");
            }
        }
    }
}