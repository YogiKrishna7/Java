
public class StringMethods {

    public static void main(String args[]) {
        // String name = "  Yogi  ";
        // boolean result = name.equals("Yogi");                    // Case sensitive, Returns a boolean value.
        // boolean result = name.equalsIgnoreCase("yogi");          // Not case sensitive, Returns a boolean value.
        // char result = name.charAt(1);                            // Returns the value at that index given.
        // int result = name.indexOf("g");                          // Returns a int, the index/position of the specified character.
        // boolean result = name.isEmpty();                         // Returns a boolean value, checks if the string is empty or not.
        // String result = name.toUpperCase();                      // Returns a string, Converts the string to upper case
        // String result = name.toLowerCase();                      // Returns a string, Converts the string to lower case
        // String result = name.trim();                             // Returns a String, Removes the spaces before and after the string.
        // String result = name.replace("o", "*");                  // Returns a String, Replaces a character with another

        // String result = name.concat(" Bear");                    // Concatenates two strings.
        // boolean result = name.startsWith("  ");                  // Checks if the string starts with "  ".
        // boolean result = name.endsWith("  ");                    // Checks if the string ends with "  ".
        // String result = name.valueOf(123);                       // Converts a primitive int to a string.
        // String result = name.substring(2, 5);                    // Extracts a substring from index 2 to 4 (exclusive).
        // String result = name.replaceFirst("Yogi", "Bear");       // Replaces the first occurrence of "Yogi" with "Bear".
        // String result = name.replaceAll("Yogi", "Bear");         // Replaces all occurrences of "Yogi" with "Bear".
        // String[] result = name.split(" ");                       // Splits the string into an array of words based on whitespace.
        // String result = name.intern();                           // Returns a String object representing this string that is interned in the string pool.
        // int result = name.compareTo("Yogi");                     // Compares this string to another string lexicographically.
        // boolean result = name.contains("Yogi");                  // Checks if this string contains the specified sequence of characters.
        // String result = name.format("Hello, %s!", "Yogi");       // Formats a string using placeholders.
        // byte[] result = name.getBytes();                         // Encodes this string into a sequence of bytes.
        // void result = name.getChars(0, 3, charArray, 0);         // Copies a range of characters from this string into a character array.
        // int result = name.lastIndexOf("g");                      // Returns the index of the last occurrence of the specified substring in this string.
        // int result = name.lastIndexOf("g", 4);                   // Returns the index of the last occurrence of the specified substring in this string, starting at the specified index.
        // String result = name.replaceAll("Yogi", "Bear");         // Replaces all occurrences of the specified regular expression in this string with the specified replacement.
        // String result = name.replaceFirst("Yogi", "Bear");       // Replaces the first occurrence of the specified regular expression in this string with the specified replacement.
        // char[] result = name.toCharArray();                      // Converts this string to a character array.



        // Methods with print statements:
        
        // System.out.println(name.concat(" Bear"));
        // System.out.println(name.startsWith("  "));
        // System.out.println(name.endsWith("  "));
        // System.out.println(name.valueOf(123));
        // System.out.println(name.substring(2, 5));
        // System.out.println(name.replaceFirst("Yogi", "Bear"));
        // System.out.println(name.replaceAll("Yogi", "Bear"));
        // System.out.println(Arrays.toString(name.split(" ")));
        // System.out.println(name.intern());
        // System.out.println(name.compareTo("Yogi"));
        // System.out.println(name.contains("Yogi"));
        // System.out.println(name.format("Hello, %s!", "Yogi"));
        // System.out.println(Arrays.toString(name.getBytes()));
        // char[] charArray = new char[4];
        // name.getChars(0, 3, charArray, 0);
        // System.out.println(Arrays.toString(charArray));
        // System.out.println(name.lastIndexOf("g"));
        // System.out.println(name.lastIndexOf("g", 4));
        // System.out.println(name.replace("Yogi", "Bear"));
        // System.out.println(name.replaceAll("Yogi", "Bear"));
        // System.out.println(name.replaceFirst("Yogi", "Bear"));
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.trim());



        // Example:
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
