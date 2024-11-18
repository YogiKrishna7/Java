public class AlternateStringMerge {
    void mergeAlternately(String word1, String word2) {
        char s[] = word1.toCharArray();
        char t[] = word2.toCharArray();

        String w3 = "";

        for(int i = 0; i < s.length; i++) {
            w3 = w3 + s[i];
            w3 = w3 + t[i];
        }
        System.out.println(w3);
    }

    public static void main(String[] args) {
        AlternateStringMerge ob = new AlternateStringMerge();
        ob.mergeAlternately("abc", "pqr");
    }
}
