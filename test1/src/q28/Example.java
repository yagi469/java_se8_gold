package q28;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {

	public static void main(String[] args) {
		try {
			Connection conn = DBTest.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO employee VALUES (1, 'Adam', '1972-01-21')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
