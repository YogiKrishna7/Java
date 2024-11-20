package ToolsQA;

import java.sql.*;

public class App 
{	
	public static void main(String[] args) {
		
		String sql = "select first_name from employee_info";
		
		String url = "jdbc:mysql://localhost:3306/parks_and_recreation";
		String username = "root";
		String password = "yogi";
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				System.out.println(name);
			}
			
			con.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
