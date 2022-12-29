package q80;

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
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt.execute("SELECT * FROM Employee");
			ResultSet rs = stmt.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) == 3) {
					rs.updateString(2, "Robert");
				}
			}
			rs.absolute(3);
			System.out.println(rs.getInt(1) + ":" + rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
