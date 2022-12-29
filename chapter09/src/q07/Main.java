package q07;

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
//	private static final String URL = "jdbc:mysql://localhost/sample";
//	private static final String USER = "root";
//	private static final String PASS = "mysql";
	// =============================================================

	
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM employee")) {

			System.out.println(rs.getString(2)); // 例外がスローされる
			
//			while (rs.next()) {
//				System.out.println(rs.getString("name"));
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
