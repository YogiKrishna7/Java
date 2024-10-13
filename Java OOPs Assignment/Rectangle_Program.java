/* 
7) Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle. 
 */

class Rectangle {

    double width;
    double height;

    double calArea(double w, double h) {
        this.width = w;
        this.height = h;

        return h * w;
    }

    double calPerimeter(double w, double h) {
        this.height = h;
        this.width = w;

        return (h + w) * 2;
    }

}

public class Rectangle_Program {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        System.out.println(r1.calArea(5, 4));
        System.out.println(r1.calPerimeter(5, 4));
    }
}
