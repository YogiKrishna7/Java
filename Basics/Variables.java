public class Variables {
    // Instance variable
    int x = 10;

    // Static variable
    static String companyname = "abc";

    // Method showing a local variable
    void show() {
        int x = 10; // Local variable (shadows instance variable)
        System.out.println(x); // Prints the local variable
    }

    // Method showing the instance variable
    void show1() {
        System.out.println(x); // Prints the instance variable
    }

    public static void main(String[] args) {
        // Accessing static variable and instance variable from an object
        System.out.println(companyname);
        Variables obj = new Variables();
        obj.show1(); // Prints the instance variable
    }
}