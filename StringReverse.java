
public class StringReverse {

    public static void main(String[] args) {
        String name = "yogi";
        String rev_str = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev_str += name.charAt(i);
        }
        System.out.println("Reverse String: " + rev_str);
    }
}
