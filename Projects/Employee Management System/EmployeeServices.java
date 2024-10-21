import java.util.*;

class EmployeeServices {
    Scanner input = new Scanner(System.in);
    ArrayList<EmployeeInfo> elist = new ArrayList<>();

    void addEmployee() {
        System.out.println("\nNumber of employees to Add: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter name: ");
            String n = input.nextLine();
            System.out.print("Enter role: ");
            String r = input.nextLine();
            System.out.print("Enter Salary: ");
            int s = input.nextInt();
            input.nextLine();

            elist.add(new EmployeeInfo(n, id, r, s));
        }
        System.out.println("\nAdded Successfully!\n");
    }

    void viewEmployees() {
        System.out.println("\nAll Employees: ");
        for (EmployeeInfo e : elist) {
            System.out.println();
            System.out.println("Employee ID: " + e.id);
            System.out.println("Employee Name: " + e.name);
            System.out.println("Employee Salary: " + e.salary);
            System.out.println("Employee Role: " + e.role);
            System.out.println();
        }
    }

    void removeEmployee() {
        System.out.print("\nEnter ID: ");
        int id = input.nextInt();
        input.nextLine();

        Iterator<EmployeeInfo> iterator = elist.iterator();
        while (iterator.hasNext()) {
            EmployeeInfo e = iterator.next();
            if (id == e.id) {
                iterator.remove();
                System.out.println("\nRemoved " + e.name + " Successfully\n");
            }
        }
    }

    void allRoles() {
        ArrayList<String> roles = new ArrayList<>();

        for (EmployeeInfo e : elist) {
            if (!roles.contains(e.role)) {
                roles.add(e.role);
            }
        }

        System.out.println("\nRoles available:");
        for (String role : roles) {
            System.out.println(role);
        }
        System.out.println();
    }

    void searchByid() {
        System.out.print("\nEnter ID: ");
        int i = input.nextInt();
        input.nextLine();
        boolean found = false;

        for (EmployeeInfo e : elist) {
            if (i == e.id) {
                System.out.println("\nEmployee ID: " + e.id);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee Role: " + e.role);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee ID: " + i + " is not found!");
        }

    }

    void searchByname() {
        System.out.print("\nEnter Name: ");
        String n = input.nextLine();
        boolean found = false;

        for (EmployeeInfo e : elist) {
            if (n.equals(e.name)) {
                System.out.println("\nEmployee ID: " + e.id);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee Role: " + e.role);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee Name: " + n + " is not found!");
        }
    }

    void searchByrole() {
        System.out.print("\nType role: ");
        String role = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        boolean found = false;

        for (EmployeeInfo e : elist) {
            if (role.equals(e.role) && name.equals(e.name)) {
                System.out.println("\nEmployee Role: " + e.role);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee ID: " + e.id);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee " + name + " not found in the role of " + role);
        }
    }

    void searchBysalary() {
        System.out.println("\nType Employee Salary: ");
        int s = input.nextInt();
        input.nextLine();
        System.out.print("Employee Name: ");
        String name = input.nextLine();
        boolean found = false;

        System.out.println("\nEmployees With salary: " + s);
        for (EmployeeInfo e : elist) {
            if (s == e.salary && name.equals(e.name)) {
                System.out.println("\nName: " + e.name);
                System.out.println("\nRole: " + e.role);
                System.out.println("Salary: " + e.salary);
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee " + name + " is not found in the salary range " + s);
        }
    }

    void search() {
        System.out.print("\nSearch Employee By ? \n1)ID 2)Name 3)Role 4)Salary: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                searchByid();
                break;
            case 2:
                searchByname();
                break;
            case 3:
                searchByrole();
                break;
            case 4:
                searchBysalary();
                break;
            default:
                System.out.println("\nInvalid Choice\n");
                break;
        }
    }

    void update() {
        System.out.println("\nEnter Employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("\nUpdate Employee's ? \n1)Name 2)Role 3)Salary: ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                for (EmployeeInfo e : elist) {
                    if (id == e.id) {
                        System.out.println("\nEnter Updated Name: ");
                        String un = input.nextLine();
                        e.name = un;
                    }
                }
                break;
            case 2:
                for (EmployeeInfo e : elist) {
                    if (id == e.id) {
                        System.out.println("\nEnter Updated Role: ");
                        String r = input.nextLine();
                        e.role = r;
                    }
                }
                break;
            case 3:
                for (EmployeeInfo e : elist) {
                    if (id == e.id) {
                        System.out.println("\nEnter Updated Salary: ");
                        int us = input.nextInt();
                        input.nextLine();
                        e.salary = us;
                    }
                }
                break;
            default:
                System.out.println("\nInvalid Choice\n");
                break;
        }
    }

    void authenticate() {
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
                            addEmployee();
                            break;
                        case 2:
                            viewEmployees();
                            break;
                        case 3:
                            allRoles();
                            break;
                        case 4:
                            search();
                            break;
                        case 5:
                            update();
                            break;
                        case 6:
                            removeEmployee();
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
    }
}
