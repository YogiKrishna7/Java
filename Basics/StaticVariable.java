public class StaticVariable {
    static String companyname = "sgsitIndkkk"; // Static variable shared by all objects

    int age; // Instance variable specific to each object
    String name;

    void display() {
        System.out.println(age + " " + companyname); // Print age (instance) and companyname (static)
    }

    public static void main(String[] args) {
        staticvariable ram = new staticvariable(); // Create object ram
        staticvariable shyam = new staticvariable(); // Create object shyam

        // Set instance variables for ram
        ram.name = "ram suryawanshi";
        // ram.age is 0 by default

        // Display information for ram
        ram.display(); // Output: 0 sgsitIndkkk

        // Display information for shyam (age is also 0 by default)
        shyam.display(); // Output: 0 sgsitIndkkk

        // Access the static variable using the class name
        System.out.println("cn is " + companyname); // Output: cn is sgsitIndkkk
    }
}