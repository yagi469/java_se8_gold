package q63;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	// JavaDB ======================================================
	private static final String URL = "jdbc:derby:db/test";
	private static final String USER = null;
	private static final String PASS = null;
	// =============================================================

	// MySQL =======================================================
//	 private static final String URL = "jdbc:mysql://localhost/test";
//	 private static final String USER = "root";
//	 private static final String PASS = "mysql";
	// =============================================================

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
			 Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE);
			 ResultSet rs = stmt.executeQuery("SELECT * FROM employee")) {
			rs.afterLast();
			rs.previous();
			System.out.println(rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
