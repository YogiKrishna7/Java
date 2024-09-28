import java.util.Scanner;

public class Employee {
    private Scanner input = new Scanner(System.in);
    private String name;
    private String jobTitle;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public void calculateSalary() {
        System.out.print("How many months do you want to calculate salary for? ");
        int noMonths = input.nextInt();

        System.out.println("Salary for " + noMonths + " months is: " + (salary * noMonths));
    }

    public void updateSalary() {
        System.out.print("Enter new Salary: ");
        int newSalary = input.nextInt();
        setSalary(newSalary);
    }

    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setName("Yogendra");
        person1.setJobTitle("Web Dev");
        person1.setSalary(15000);

        person1.displayInfo();

        Employee person2 = new Employee();
        person2.displayInfo();
    }
}
