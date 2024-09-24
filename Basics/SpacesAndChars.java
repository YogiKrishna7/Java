
public class SpacesAndChars {

    public static void main(String[] args) {
        // The sentence to be analyzed
        String sentence = "My name is yogendra and studying in BCA";

        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // Initialize counters for spaces and words
        int spaceCount = 0;
        int wordCount = 0;

        // Count the number of words by iterating through the words array
        for (int i = 0; i < words.length; i++) {
            wordCount++;
        }

        // Count the number of spaces by iterating through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Print the results
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of words: " + wordCount);

    }
}
