import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");

        // Read the user's age as an integer and store it in the 'age' variable
        int age = sc.nextInt();

        // Display the user's age
        System.out.println("Your age is: " + age);

        // Prompt the user to enter their name
        System.out.println("Enter your name: ");

        // Read the user's name as a String and store it in the 'name' variable
        // Using sc.nextLine() ensures capturing full names with spaces
        String name = sc.nextLine();

        // Display the user's name
        System.out.println("Your name is: " + name);

        // Prompt the user to enter their gender (single character)
        System.out.println("Enter your gender (M/F): ");

        // Read the user's input as a String and extract the first character (gender)
        char gender = sc.nextLine().charAt(0);

        // Display the user's gender
        System.out.println("Your gender is: " + gender);

        // Prompt the user to enter their salary
        System.out.println("Enter your salary: ");

        // Read the user's salary as a float and store it in the 'salary' variable
        float salary = sc.nextFloat();

        // Display the user's salary
        System.out.println("Your salary is: " + salary);

        // Close the Scanner object (optional, but good practice)
        sc.close();
    }
}