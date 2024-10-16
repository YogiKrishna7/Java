import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type 1st Word: ");
        System.out.print("Type 2nd Word: ");
        
        String word1 = input.next();
        String word2 = input.next();

        char carray1[] = word1.toCharArray();
        char carray2[] = word2.toCharArray();
        Arrays.sort(carray1);
        Arrays.sort(carray2);

        if (Arrays.equals(carray1, carray2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}
