import java.util.*;

class EmployeeInfo {
    Scanner input = new Scanner(System.in);
    String name;
    int id;
    int salary;
    String role;

    EmployeeInfo(String name, int id, String role, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.role = role;
    }
}