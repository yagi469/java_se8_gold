package q77;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	// JavaDB ======================================================
	private static final String URL = "jdbc:derby:db/test";
	private static final String USER = null;
	private static final String PASS = null;
	// =============================================================

	// MySQL =======================================================
//	private static final String URL = "jdbc:mysql://localhost/test";
//	private static final String USER = "root";
//	private static final String PASS = "mysql";
	// =============================================================
	
	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			String query = "SELECT * FROM employee WHERE ID = 1";
			Statement stmt = conn.createStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id"));
				System.out.println("Name:" + rs.getString("name"));
				System.out.println("Birth:" + rs.getDate("birth"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
