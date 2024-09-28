public class Airoplane {
    
    void flightStatus(int fNumber, String from, String to, double arrivalTime, double departureTime) {
        double currentArrivalTime = 11.30;

        double timeDifference = Math.round((arrivalTime - currentArrivalTime) * 60);

        if (arrivalTime == currentArrivalTime) {
            System.out.println("The flight Number " + fNumber + " From: " + from + " Flying To " + to + " Flight Is On Time!");
        } else if (timeDifference < 0) {
            System.out.println("The flight Number " + fNumber + " From: " + from + " Flying To " + to + " Flight Is Arriving Early by " + timeDifference + " Minutes!");
        }else{
            System.out.println("The flight Number " + fNumber + " From: " + from + " Flying To " + to + " Flight Is Delayed by " + timeDifference + " Minutes!");
        }
    }

    public static void main(String[] args) {
        Airoplane person1 = new Airoplane();
        person1.flightStatus(1234567, "Vizag", "Port Blair", 14.50, 10.25);
    }
}
