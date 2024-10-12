
public class ArrayReverse {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        StringBuffer a = new StringBuffer();

        for (int i : arr) {
            a.append(i);
        }

        a.reverse();

        String sb = a.toString();

        char arr2[] = sb.toCharArray();

        for (char i : arr2) {
            System.out.print(i + " ");
        }

    }
}
