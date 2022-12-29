package q04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			// データベースに対する処理
			System.out.println(conn.getMetaData().getDatabaseProductName()); // データベース名の表示
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
