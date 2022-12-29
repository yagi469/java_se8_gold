package q09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	// JavaDB ======================================================
	private static final String URL = "jdbc:derby:db/sample";
	private static final String USER = null;
	private static final String PASS = null;
	// =============================================================

	// MySQL =======================================================
	// private static final String URL = "jdbc:mysql://localhost/sample";
	// private static final String USER = "root";
	// private static final String PASS = "mysql";
	// =============================================================

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USER, PASS); 
			 Statement stmt = conn.createStatement()) {

			System.out.println(stmt.execute("DELETE FROM employee"));

//			boolean result = stmt.execute("SELECT * FROM employee");
//			ResultSet rs = stmt.getResultSet();
//			while (rs.next()) {
//				System.out.println(rs.getString(2));
//			}
			
//			boolean result = stmt.execute("DELETE FROM employee WHERE id = 1");
//			int count = stmt.getUpdateCount();
//			System.out.println(count);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
