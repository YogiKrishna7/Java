import java.sql.*;

public class Connect{
    static Connection getConnected() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "yogi";

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            return con;

        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
