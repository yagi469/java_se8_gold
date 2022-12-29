package q08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
			 ResultSet rs = stmt.executeQuery("SELECT * FROM dt")) {

			rs.next();
			
			Date sqlDate = rs.getDate("d"); // 日付のみ
			Time sqlTime = rs.getTime("t"); // 時間のみ
			Timestamp sqlTimestamp = rs.getTimestamp("ts"); // 日付と時間
			
			LocalDate localDate = sqlDate.toLocalDate(); // 日付の変換
			LocalTime localTime = sqlTime.toLocalTime(); // 時間の変換
			LocalDateTime localDateTime = sqlTimestamp.toLocalDateTime(); // 日付と時間の変換
			
			System.out.println(localDate);
			System.out.println(localTime);
			System.out.println(localDateTime);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
