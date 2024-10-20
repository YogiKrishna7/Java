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
        for (EmployeeInfo e : elist) {
            if (i == e.id) {
                System.out.println("\nEmployee ID: " + e.id);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee Role: " + e.role);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
            }
        }
    }

    void searchByname() {
        System.out.print("\nEnter Name: ");
        String n = input.nextLine();
        for (EmployeeInfo e : elist) {
            if (n.equals(e.name)) {
                System.out.println("\nEmployee ID: " + e.id);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee Role: " + e.role);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
            }
        }
    }

    void searchByrole() {
        System.out.print("\nType role: ");
        String role = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();

        for (EmployeeInfo e : elist) {
            if (role.equals(e.role) && name.equals(e.name)) {
                System.out.println("\nEmployee Role: " + e.role);
                System.out.println("Employee Name: " + e.name);
                System.out.println("Employee ID: " + e.id);
                System.out.println("Employee Salary: " + e.salary);
                System.out.println();
            }
        }
    }

    void searchBysalary() {
        System.out.println("\nType Employee Salary: ");
        int s = input.nextInt();
        input.nextLine();

        System.out.println("\nEmployees With salary: " + s);
        for (EmployeeInfo e : elist) {
            if (s == e.salary) {
                System.out.println("\nName: " + e.name);
                System.out.println("Salary: " + e.salary);
                System.out.println();
            }
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

}
