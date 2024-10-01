public class removeChars {
    void removeCharacters(String word, String c) {
        String result = word.replace(c, "");
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeChars s1 = new removeChars();
        s1.removeCharacters("palak", "a");
    }
}
