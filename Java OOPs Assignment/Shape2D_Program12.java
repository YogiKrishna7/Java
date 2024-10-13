/* 
12) Write a Java program to create an abstract class Shape2D with abstract methods draw()
and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and
implement the respective methods to draw and resize each shape. 
*/

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Scanner;
import java.awt.*;

abstract class Shape2D {

    abstract void draw();

    abstract void resize();
}

class Rectangle extends Shape2D {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    void resize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        length = scanner.nextInt();

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < width; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

}

class Circle extends Shape2D {

    private int radius; // Radius of the circle

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Determine the size of the canvas based on the radius
        int diameter = radius * 2;

        // Loop through each row
        for (int i = 0; i <= diameter; i++) {
            // Loop through each column
            for (int j = 0; j <= diameter; j++) {
                // Calculate the distance from the center of the circle
                int dx = radius - i; // Distance in the x direction
                int dy = radius - j; // Distance in the y direction

                // Circle equation: (x - centerX)^2 + (y - centerY)^2 = radius^2
                if ((dx * dx + dy * dy) <= (radius * radius)) {
                    System.out.print("*"); // Draw the circle
                } else {
                    System.out.print(" "); // Fill with space
                }
            }
            System.out.println(); // Move to the next row
        }
    }

    @Override
    public void resize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new radius of the circle: ");
        radius = scanner.nextInt(); // Change the radius based on user input
    }

    // private int x;      // X-coordinate of the circle center
    // private int y;      // Y-coordinate of the circle center
    // private int radius; // Radius of the circle
    // public Circle(int x, int y, int radius) {
    //     this.x = x;
    //     this.y = y;
    //     this.radius = radius;
    // }
    
    // @Override
    // public void draw() {
    //     // Create a new Frame to draw the circle
    //     Frame frame = new Frame("Circle Drawing") {
    //         @Override
    //         public void paint(Graphics g) {
    //             g.setColor(Color.BLUE); // Set the color for the circle
    //             g.fillOval(x - radius, y - radius, radius * 2, radius * 2); // Draw the circle
    //         }
    //     };
    //     frame.setSize(300, 300); // Set the size of the window
    //     frame.setVisible(true); // Make the window visible
    //     // Close the frame when the window is closed
    //     frame.addWindowListener(new java.awt.event.WindowAdapter() {
    //         public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    //             System.exit(0);
    //         }
    //     });
    // }

    // @Override
    // public void resize() {
    //     // For demonstration, we'll just double the radius
    //     this.radius *= 2; // Resize the circle (you can change this logic as needed)
    // }
}

public class Shape2D_Program12 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 14);
        r1.draw();

        Circle c1 = new Circle(10);
        c1.draw();
    }
}
