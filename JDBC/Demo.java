import java.sql.*;

public class Demo {

    // Method to retrieve a single employee's first name based on employee ID
    void singleValue() {
        String sql = "select first_name from employee_info where employee_id = 1";

        // Database connection details: URL, username, and password
        String url = "jdbc:mysql://localhost:3306/parks_and_recreation";
        String username = "root";
        String password = "yogi7";

        // Establish a connection to the MySQL database
        try (Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement st = con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {

            // Move to the first row in the result set if available
            if (rs.next()) {
                // Retrieve the value from the first column (first_name) in the current row
                String name = rs.getString(1);
                System.out.println("Single Employee Name: " + name); // Print the name
            } else {
                System.out.println("No employee found with the given ID.");
            }
        } catch (SQLException e) {
            // Print an error message if there's an issue with SQL execution
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Method to retrieve and print all employees' first names
    void multipleValues() {
        // Define the SQL query to select all columns from employee_info
        String sql = "select * from employee_info";
        String url = "jdbc:mysql://localhost:3306/parks_and_recreation";
        String username = "root";
        String password = "yogi7";

        // Try-with-resources block to automatically manage resource closing
        try (Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement st = con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {

            // Loop through the result set and print the first name (assumed to be in the
            // second column)
            while (rs.next()) {
                String name = rs.getString(2); // Retrieve the second column (first_name)
                System.out.println("Employee Name: " + name); // Print the name
            }

        } catch (SQLException e) {
            // Print an error message if there's an issue with database access
            System.err.println("Error retrieving data: " + e.getMessage());
        }
    }

    // Main method to execute the functionalities
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.singleValue(); // Call method to retrieve a single employee's name
        demo.multipleValues(); // Call method to retrieve all employee names
    }
}
