public class Frequency {

    public static void main(String[] args) {
        String str = "pictureperfect";

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            int c = 0;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == alphabet) {
                    c++;
                }
            }

            if (c > 0) {
                System.out.println(alphabet + "-" + c);
            }
        }
    }
}
