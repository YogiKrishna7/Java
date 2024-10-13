/* 
3) Write a Java program to create a class called "Employee" with a name, salary, and hire
date attributes, and a method to calculate years of service. For Temporary Employee &
Permanent employee 
*/

import java.time.LocalDate;
import java.time.Period;

class Employee {

    String name;
    double salary;
    LocalDate hireDate;

    public void setDetails(String n, double sal, LocalDate hDate) {
        this.name = n;
        this.salary = sal;
        this.hireDate = hDate;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
    }
}

class Temporary extends Employee {

    LocalDate contractEndsIn;

    public void setDetails(String n, double sal, LocalDate hDate, int contractTime) {
        super.setDetails(n, sal, hDate);
        this.contractEndsIn = hDate.plusYears(contractTime);
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Type: Temporary");
        super.displayInfo();
        System.out.println("End of Contract: " + contractEndsIn);
        
    }
}

class Permanent extends Employee {

    public void setDetails(String n, double sal, LocalDate hDate) {
        super.setDetails(n, sal, hDate);
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Type: Permanent");
        super.displayInfo();
        LocalDate currentDate = LocalDate.now();
        System.out.println("Years of service: " + Period.between(super.hireDate, currentDate).getYears());
        
    }
}

public class Program3 {

    public static void main(String[] args) {

        Temporary ob1 = new Temporary();
        ob1.setDetails("Yogi", 15000, LocalDate.of(2023, 3, 7), 2);
        ob1.displayInfo();

        System.out.println();

        Permanent ob2 = new Permanent();
        ob2.setDetails("Sailu", 25000, LocalDate.of(2021, 2, 12));
        ob2.displayInfo();
    }
}
