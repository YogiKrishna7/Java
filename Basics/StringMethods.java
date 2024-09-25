public class StringMethods {

    public static void main(String args[]) {
        String s = "This is my book"; // Declare a string variable and initialize it with a sentence

        // Split the string into an array of words based on spaces
        String s1[] = s.split(" ");

        // Iterate through the array of words
        for (int i = 0; i < s1.length; i++) {
            // Replace the first occurrence of "i" in the first word with "*"
            System.out.print(s1[0].replace("i", "*") + " ");

            // Convert the second word to uppercase
            System.out.print(s1[1].toUpperCase() + " ");

            // Convert the third word to lowercase
            System.out.print(s1[2].toLowerCase() + " ");

            // Extract the first 7 characters from the original string
            System.out.print(s.substring(0, 7) + " ");

            // Break out of the loop
            break;
        }
    }
}