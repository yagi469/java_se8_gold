package q46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	// JavaDB ======================================================
	private static final String URL = "jdbc:derby:db/test";
	private static final String USER = null;
	private static final String PASS = null;
	// =============================================================

	// MySQL =======================================================
	// private static final String URL = "jdbc:mysql://localhost/test";
	// private static final String USER = "root";
	// private static final String PASS = "mysql";
	// =============================================================

	public static void main(String[] args) {

		String query = "SELECT id FROM author";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
			 Statement stmt = conn.createStatement()) {

			ResultSet rs = stmt.executeQuery(query);
			stmt.executeQuery("SELECT id FROM book");
			while (rs.next()) {
				System.out.println("Publisher[ID]: " + rs.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
