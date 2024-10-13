/* 
10) Write a Java program to create a class called Employee with methods called work() and
getSalary(). Create a subclass called HRManager that overrides the work() method and adds
a new method called addEmployee(). 

the Employee class has a work() method that prints a message and a getSalary() method
that returns the employee's salary. The HRManager subclass extends the Employee class and
overrides the work() method to display a different message. It adds a method
addEmployee() that prints a message indicating that a new employee is being added. The
Main class creates an instance of Employee and HRManager, calls the work() and getSalary()
methods, and also calls the addEmployee() method on the HRManager object.
*/

class Employee{
    void work(){
        System.out.println("Employee Works");
    }
    int getSalary(int sal){
        return sal;
    }
}

class HRManager extends Employee{
    @Override
    void work(){
        System.out.println("HR working");
    }
    void addEmployee(){
        System.out.println("Adding Employee");
    }
}

public class Employee_Program3 {
    public static void main(String[] args) {
        Employee ob1 = new Employee();
        ob1.work();
        System.out.println(ob1.getSalary(15000));

        HRManager ob2 = new HRManager();
        ob2.work();
        System.out.println(ob2.getSalary(25000));
        ob2.addEmployee();
    }
}
