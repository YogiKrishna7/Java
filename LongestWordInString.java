public class LongestWordInString {

    public static void main(String[] args) {
        // The string to be analyzed
        String sentence = "Find the Longestfghghgf Word in a String";

        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // Initialize a variable to store the length of the longest word
        int longestWordLength = words[0].length();

        // Initialize a variable to store the longest word itself
        String longestWord = "";

        // Iterate through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Get the current word and its length
            String currentWord = words[i];
            int currentWordLength = currentWord.length();

            // Check if the current word is longer than the longest word found so far
            if (longestWordLength < currentWordLength) {
                // If it's longer, update the longest word and its length
                longestWordLength = currentWordLength;
                longestWord = currentWord;
            }
        }

        // Print the longest word
        System.out.println("The longest word: " + longestWord);
    }
}