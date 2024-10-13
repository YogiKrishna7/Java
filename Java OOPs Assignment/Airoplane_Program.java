/* 
1) Write a Java program to create a class called "Airplane" with a flight number, destination,
and departure time attributes, and methods to check flight status and delay 
*/

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class Airoplane {

    int flightNumber;
    String destination;
    String departureTime;

    static LocalTime RandomTime() {
        Random randTime = new Random();
        int hours = randTime.nextInt(24);
        int mins = randTime.nextInt(60);

        return LocalTime.of(hours, mins);
    }

    static LocalTime TicketTime(String dTime) {
        return LocalTime.parse(dTime);
    }

    static String timeDifference(LocalTime t1, LocalTime t2) {
        Duration diff = Duration.between(t1, t2);
        long hour = diff.toHours();
        long min = diff.toMinutes() % 60;

        return Math.abs(hour) + " hours, " + Math.abs(min) + " minutes";
    }

    void checkStatus(int fNumber, String des, String dt) {
        this.flightNumber = fNumber;
        this.destination = des;
        this.departureTime = dt;

        LocalTime CDT = RandomTime(); //current depature time
        LocalTime TT = TicketTime(dt); //ticket time

        System.out.println("\nCurrent departure time of flight " + fNumber + " is " + CDT);
        System.out.println("The time on Ticket: " + TT);

        if (TT.equals(CDT)) {
            System.out.println("The Flight " + fNumber + " is on time!");
        } else if (CDT.isBefore(TT)) {
            System.out.println("The Flight " + fNumber + " is taking off early by " + timeDifference(TT, CDT));
        } else {
            System.out.println("The Flight " + fNumber + " is taking off late by " + timeDifference(TT, CDT));
        }
        System.out.println();
    }

}

public class Airoplane_Program{

    public static void main(String[] args) {
        Airoplane p1 = new Airoplane();
        p1.checkStatus(121345, "Vizag", "10:35");
        System.out.println(p1.flightNumber);
        System.out.println(p1.destination);
        System.out.println(p1.departureTime);

        Airoplane p2 = new Airoplane();
        p2.checkStatus(123456, "Port Balir", "11:40");
        System.out.println(p2.flightNumber);
        System.out.println(p2.destination);
        System.out.println(p2.departureTime);
    }
}
