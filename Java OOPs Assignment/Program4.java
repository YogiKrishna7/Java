/* 
4) Write a Java program to create class called "TrafficLight" with attributes for color and
duration, and methods to change the color and check for red or green

we create an instance of the "TrafficLight" class with the color "red" and a duration of 30
seconds. We then print whether the light is red or green using the “isRed” and “isGreen”
methods. We change the light color to "green" through the “changeColor” method, and
display whether the light is now green. We also print the light duration using the
“getDuration” method, and change the duration to 60 seconds with the “setDuration”
method. 
*/

class TrafficLight {

    String color;
    int duration;

    void setDuration(int d) {
        this.duration = d;
    }

    void changeColor(String c) {
        this.color = c.toLowerCase();
    }

    void isRed() {
        if (color.equals("red")) {
            System.out.println("The light is red.");
        } else {
            System.out.println("The light is not red.");
        }
    }

    void isGreen() {
        if (color.equals("green")) {
            System.out.println("The light is green.");
        } else {
            System.out.println("The light is not green.");
        }
    }

    void getDuration() {
        System.out.println("Duration: " + this.duration + " seconds");
    }

}

public class Program4 {

    public static void main(String[] args) {

        TrafficLight ob1 = new TrafficLight();
        ob1.changeColor("red");
        ob1.setDuration(30);

        ob1.isRed();

        ob1.changeColor("green");

        ob1.isGreen();

        ob1.getDuration();

        ob1.setDuration(60);

        ob1.getDuration();
    }
}
