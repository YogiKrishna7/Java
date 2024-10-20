import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeServices e1 = new EmployeeServices();
        Scanner input = new Scanner(System.in);
        String usernames[] = { "yogi", "prasad" };
        String passwords[] = { "yogi@2002", "prasad@2004" };

        System.out.println("=== Employee Management System ===\n");

        System.out.print("Enter Your Username: ");
        String username = input.nextLine();
        System.out.print("Enter Your Password: ");
        String password = input.nextLine();
        System.out.println();

        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                boolean done = false;
                do {
                    System.out.println("=== Main Menu ===");
                    System.out.println("1) Add Employee");
                    System.out.println("2) View All Employees");
                    System.out.println("3) Show All Roles");
                    System.out.println("4) Search Employee");
                    System.out.println("5) Update Employee Details");
                    System.out.println("6) Remove Employee");
                    System.out.println("7) Exit");
                    System.out.println("===============================");

                    System.out.print("\nEnter your choice (1-7): ");
                    int choice = input.nextInt();
                    input.nextLine();

                    System.out.println();

                    switch (choice) {
                        case 1:
                            e1.addEmployee();
                            break;
                        case 2:
                            e1.viewEmployees();
                            break;
                        case 3:
                            e1.allRoles();
                            break;
                        case 4:
                            e1.search();
                            break;
                        case 5:
                            e1.update();
                            break;
                        case 6:
                            e1.removeEmployee();
                            break;
                        case 7:
                            done = true;
                            System.out.println("Exiting...\n");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a number between 1 and 7.\n");
                    }
                } while (!done);
                return;
            }
        }
        System.out.println("Invalid username or password.\n");
        input.close();
    }
}
