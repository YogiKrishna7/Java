import java.sql.*;

public class sqldemo {
    public static void main(String[] args) throws SQLException {
        String query = "select data from demoinfo";
        String query2 = "insert into demoinfo values(1,'palakrai','2024-12-03')";

        String url = "jdbc:mysql://localhost:3306/demo";
        String un = "root";
        String pw = "yogi";

        Connection con = DriverManager.getConnection(url, un, pw);

        Statement st = con.createStatement();

        st.executeUpdate(query2);

        ResultSet rs = st.executeQuery("select * from demoinfo");

        
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + "" + rs.getString(3));
        }
    }
}