public class AlternateStringMerge {
    public String mergeAlternately(String word1, String word2) {
        char s[] = word1.toCharArray();
        char t[] = word2.toCharArray();
        String word3 = "";
        for (int i = 0; i < s.length(); i++) {
            word3 += s[i] + "" + t[i];
        }
        System.out.println(word3);
        return word3;
        
    }

    public static void main(String[] a) {
        AlternateStringMerge s = new AlternateStringMerge();
        s.mergeAlternately("abc", "pqr");
    }
}
