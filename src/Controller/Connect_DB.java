package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_DB {
	static String jdbcURL="jdbc:mysql://localhost:3306/sqa_qlnh?useSSL=false";
	static String jdbcUsername="root";
	static String jdbcPassword="hieupro123";
	public static Connection connection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
