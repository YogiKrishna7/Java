/* 
9) Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car". 
*/

class Vehicle {

    void drive() {
        System.out.println("Driving a Vehicle");
    }
}

class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Repairing a Car");
    }
}

public class Program9 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
    }
}
