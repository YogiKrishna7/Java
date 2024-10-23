import java.util.*;

class EmployeeInfo {
    private String name;
    private int id;
    private int salary;
    private String role;

    EmployeeInfo(String name, int id, String role, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.role = role;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class EmployeeServices {
    Scanner input = new Scanner(System.in);
    Map<Integer, EmployeeInfo> emap = new HashMap<>();

    void addEmployee() {
        System.out.println("\nNumber of employees to Add: ");
        int num = input.nextInt();
        input.nextLine();

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

            emap.put(id, new EmployeeInfo(n, id, r, s));
        }
        System.out.println("\nAdded Successfully!\n");
    }

    void viewEmployees() {
        System.out.println("\nAll Employees: ");
        for (Map.Entry<Integer, EmployeeInfo> n : emap.entrySet()) {
            System.out.println();
            System.out.println("Employee ID: " + n.getKey());
            System.out.println("Employee Name: " + n.getValue().getName());
            System.out.println("Employee Salary: " + n.getValue().getSalary());
            System.out.println("Employee Role: " + n.getValue().getRole());
        }
    }

    void removeEmployee() {
        System.out.print("\nEnter ID: ");
        int id = input.nextInt();
        input.nextLine();

        emap.remove(id);
        System.out.println("Removed Employee!");
    }

    void allRoles() {
        Set<String> roles = new HashSet<>();

        for (EmployeeInfo e : emap.values()) {
            roles.add(e.getRole());
        }

        System.out.println("\nAll Roles: ");
        for (String role : roles) {
            System.out.println(role.toUpperCase());
        }
    }

    void searchById() {
        System.out.print("\nEnter ID: ");
        int id = input.nextInt();
        input.nextLine();
        EmployeeInfo emp = emap.get(id);

        if (emp != null) {
            System.out.println("\nEmployee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Role: " + emp.getRole());
            System.out.println("Employee Salary: " + emp.getSalary());
            System.out.println();
        } else {
            System.out.println("Employee ID: " + id + " is not found!");
        }
    }

    void searchByName() {
        System.out.print("\nEnter Name: ");
        String searchName = input.nextLine();
        boolean found = false;

        System.out.println("\nEmployees Found:");
        for (EmployeeInfo emp : emap.values()) {
            if (emp.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println("\nEmployee ID: " + emp.getId());
                System.out.println("Employee Name: " + emp.getName());
                System.out.println("Employee Role: " + emp.getRole());
                System.out.println("Employee Salary: " + emp.getSalary());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with the name: " + searchName);
        }
    }

    void searchByRole() {
        System.out.print("\nType role: ");
        String role = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        boolean found = false;

        for (EmployeeInfo emp : emap.values()) {
            if (role.equals(emp.getRole()) && name.equals(emp.getName())) {
                System.out.println("\nEmployee Role: " + emp.getRole());
                System.out.println("Employee Name: " + emp.getName());
                System.out.println("Employee ID: " + emp.getId());
                System.out.println("Employee Salary: " + emp.getSalary());
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee " + name + " not found in the role of " + role);
        }
    }

    void searchBySalary() {
        System.out.print("\nType Employee Salary: ");
        int s = input.nextInt();
        input.nextLine();
        System.out.print("Employee Name: ");
        String name = input.nextLine();
        boolean found = false;

        System.out.println("\nEmployees With salary: " + s);

        for (EmployeeInfo emp : emap.values()) {
            if (s == emp.getSalary() && name.equals(emp.getName())) {
                System.out.println("\nName: " + emp.getName());
                System.out.println("Role: " + emp.getRole());
                System.out.println("Salary: " + emp.getSalary());
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
                searchById();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByRole();
                break;
            case 4:
                searchBySalary();
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

        EmployeeInfo emp = emap.get(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("\nUpdate Employee's ? \n1)Name 2)Role 3)Salary: ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nEnter Updated Name: ");
                emp.setName(input.nextLine());
                break;
            case 2:
                System.out.println("\nEnter Updated Role: ");
                emp.setRole(input.nextLine());
                break;
            case 3:
                System.out.println("\nEnter Updated Salary: ");
                emp.setSalary(input.nextInt());
                input.nextLine();
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
                            System.out.println("Invalid Choice! Try again.\n");
                            break;
                    }
                } while (!done);
            }
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeServices services = new EmployeeServices();
        services.authenticate();
    }
}
