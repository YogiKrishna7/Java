public class practice extends Thread {
    int num;

    // Constructor to set the number for the multiplication table
    public practice(int num) {
        this.num = num;
    }

    // Override the run method to execute the table calculation in a thread
    public void run() {
        calTables();
    }

    // Method to print the multiplication table
    void calTables() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        // Creating threads for tables of 5 and 10
        practice table5 = new practice(5);
        practice table10 = new practice(10);

        // Starting the threads
        table5.start();
        table10.start();
    }
}
