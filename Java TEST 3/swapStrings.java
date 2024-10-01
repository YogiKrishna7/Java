public class swapStrings {
    public static void main(String[] args) {
        String s1 = "one";
        String s2 = "two";

        s1 = s1 + s2;
        s2 = s1.substring(0, 3);
        s1 = s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);
    }
}
