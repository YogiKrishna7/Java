/* 
11) Write a Java program to create an abstract class Shape with abstract methods
calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend
the Shape class and implement the respective methods to calculate the area and perimeter
of each shape. 
*/

abstract class Shape {

    abstract void calculateArea();

    abstract void calculatePerimeter();
}

class Circle extends Shape {

    int radius;
    final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of the Circle: " + pi * (radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the Circle: " + (2 * pi * radius));
    }
}

class Triangle extends Shape {

    double base, height, sideA, sideB, sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of the Triangle: " + (0.5 * base * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the Triangle: " + (sideA + sideB + sideC));
    }
}

public class Shape_Program {

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        c1.calculateArea();
        c1.calculatePerimeter();

        Triangle t1 = new Triangle(7, 14, 2, 5, 7);
        t1.calculateArea();
        t1.calculatePerimeter();
    }
}
