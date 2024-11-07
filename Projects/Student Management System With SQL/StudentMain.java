import java.sql.*;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection c = Connect.getConnected();
        StudentDeo sd = new StudentDeo(c);

        int choice;
        do {

            System.out.println("Menu");
            System.out.println("1) Add Student");
            System.out.println("2) Remove Student");
            System.out.println("3) View Student");
            System.out.println("4) Update Student");
            System.out.println("5) Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    sd.addStudent();
                    break;
                case 2:
                    sd.removeStudent();
                    break;
                case 3:
                    sd.viewStudents();
                    break;
                case 4:
                    sd.updateStudent();
                    break;
                case 5:
                    c.close();
                    return;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        } while (choice != 5);

        input.close();
    }
}
