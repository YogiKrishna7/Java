import java.util.*;
public class StringRotation {
    public static void main(String[] args) {
        String word = "Hello";
        String letter = word.substring(0, 1);
        System.out.println(word.replace("H", "") + letter);
    

        StringBuffer word2 = new StringBuffer("Hello World");
        System.out.println(word2.deleteCharAt(0).insert(4, "H").deleteCharAt(6).insert(10, "W"));
    }
}
