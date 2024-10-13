/* 
2) Write a Java program to create a class called "Employee" with a name, job title, and salary
attributes, and methods to calculate and update salary. 
*/

import java.util.Scanner;

class Employee {

    private Scanner input = new Scanner(System.in);
    private String name;
    private String jobTitle;
    private int salary;

    public void setDetails(String n, String jT, int sal) {
        this.name = n;
        this.jobTitle = jT;
        this.salary = sal;
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
        setDetails(name, jobTitle, newSalary);
    }

}

public class Employee_Program2 {

    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setDetails("Yogi", "Full Stack Dev", 65000);
        person1.displayInfo();
        person1.calculateSalary();
        person1.updateSalary();
        person1.displayInfo();
    }
}
