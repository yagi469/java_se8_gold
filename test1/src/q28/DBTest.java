package q28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

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
			
	private static Connection newConn = null;

	public static Connection getConnection() throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			newConn = conn;
		}
		return newConn;
	}
}
