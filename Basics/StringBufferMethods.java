public class StringBufferMethods {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Yogi");

        // Append
        sb.append(" Apple");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(1, "0");
        System.out.println("After insert: " + sb);

        // Display capacity
        System.out.println("Capacity: " + sb.capacity());

        // Delete character at index 2
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt(2): " + sb);

        // Delete characters from index 0 to 1
        sb.delete(0, 1);
        System.out.println("After delete(0, 1): " + sb);

        // Replace characters from index 1 to 3 with "Java"
        sb.replace(1, 3, "Java");
        System.out.println("After replace(1, 3, 'Java'): " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Get substring from index 1 to 3
        String substring = sb.substring(1, 3);
        System.out.println("Substring from index 1 to 3: " + substring);

        // Get length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // Convert to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result);
    }
}
