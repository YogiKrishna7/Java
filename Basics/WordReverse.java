
public class WordReverse {

    public static void main(String[] args) {
        String sentence = "welcome to java";
        String word[] = sentence.split(" ");

        for (String n : word) {
            StringBuffer w = new StringBuffer(n);
            w.reverse();
            System.out.print(w + " ");
        }

    }
}
