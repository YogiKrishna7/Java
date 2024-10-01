public class Frequency {

    public static void main(String[] args) {
        String str = "pictureperfect";

        // Iterate through each letter of the alphabet
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            int c = 0;  // Count for the current letter
            
            // Count occurrences of the current letter in the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == alphabet) {
                    c++;
                }
            }

            // Print the character and its count if it appears in the string
            if (c > 0) {
                System.out.println(alphabet + "-" + c);
            }
        }
    }
}
