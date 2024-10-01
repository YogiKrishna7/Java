
public class Average {

    public static void main(String[] args) {
        int num = 7;
        int sum = 0;
        int count = 0;
        int avg;

        for (int i = 1; i <= num; i++) {
            count++;
            sum = sum + i;
        }

        avg = (sum / count);
        System.out.println("Average of " + num + " numbers is: " + avg);
    }
}
