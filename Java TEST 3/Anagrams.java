
import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String a = "keep";
        String b = "peek";

        
        System.out.println("Length of a: " + a.length());
        System.out.println("Length of b: " + b.length());

        
        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
        } else {
            
            char aChar[] = a.toCharArray();
            char bChar[] = b.toCharArray();

            
            Arrays.sort(aChar);
            Arrays.sort(bChar);

            
            boolean isAnagram = Arrays.equals(aChar, bChar);
            if (isAnagram) {
                System.out.println("Anagram!");
            } else {
                System.out.println("Not an Anagram!");
            }
        }
    }
}
