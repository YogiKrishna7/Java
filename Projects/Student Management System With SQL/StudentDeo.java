import java.sql.*;
import java.util.Scanner;

public class StudentDeo {
    Scanner input = new Scanner(System.in);
    Connection c;

    StudentDeo(Connection c) {
        this.c = c;
    }

    void addStudent() throws SQLException {
        System.out.print("No of Students to Add: ");
        int noOfStudents = input.nextInt();
        for (int i = 0; i < noOfStudents; i++) {
            String query = "insert into info values(?, ?)";

            System.out.print("Enter id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter name: ");
            String name = input.nextLine();
            try {
                PreparedStatement ps = c.prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2, name);
                int d = ps.executeUpdate();
                if (d > 0) {
                    System.out.println("Inserted Successfully");
                } else {
                    System.out.println("Not Inserted");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    void removeStudent() throws SQLException {
        String query = "delete from info where id = ?;";

        System.out.print("Enter id: ");
        int id = input.nextInt();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("Not Deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateStudent() throws SQLException {
        String quary = "update info set name = ? where id = ?";

        System.out.println("Enter id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter new/ update name: ");
        String newName = input.nextLine();

        PreparedStatement ps = c.prepareStatement(quary);
        ps.setInt(2, id);
        ps.setString(1, newName);
        int done = ps.executeUpdate();
        if (done > 0) {
            System.out.println("Updated");
        } else {
            System.out.println("Update Not Successful");
        }
    }

    void viewStudents() throws SQLException {
        String query = "select * from info";

        PreparedStatement ps = c.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }

    }
}
