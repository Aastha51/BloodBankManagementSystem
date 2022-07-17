package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnectionClass {
	public  static Connection getConnection() {
		Connection con=null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","root@1");
			 System.out.print("connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 
	}	
}
