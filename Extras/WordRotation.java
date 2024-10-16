public class WordRotation {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("Hello");
        System.out.println(word.deleteCharAt(0).insert(word.length(), "H"));

        StringBuffer word2 = new StringBuffer("Hello World");
        System.out.println(word2.deleteCharAt(0).deleteCharAt(5).insert(4, "H").insert(word2.length(), "W"));
    }
}
