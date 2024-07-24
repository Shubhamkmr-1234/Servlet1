package test;

import java.sql.*;

public class Connections {
	public static Connection getConnections() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			System.out.println(con);
		} catch (Exception e) {
			System.out.println("con=" + con);
			e.printStackTrace();
		}
		return con;
	}

}
