package q84;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static Connection connectToDb() throws SQLException {
		
		// 以下接続情報はMySQL用
		String url = "jdbc:mysql://localhost:3306/";
		String database = "test";
		String user = "root";
		String password = "mysql";
		
		// JavaDBの場合
//		String url = "jdbc:derby:db/";
//		String database = "test";
//		String user = null;
//		String password = null;
		
		// line n1
		// A.
//		return DatabaseManager.getConnection(url, database, user, password);
		
		// B.
//		return Connection.getConnection(url, database, user, password);
		
		// C.
		return DriverManager.getConnection(url + database, user, password);
		
		// D.
//		return DatabaseDriver.getConnection(url + database, user, password);
	}
	
	public static void main(String[] args) {
		try (Connection conn = connectToDb()) {
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
