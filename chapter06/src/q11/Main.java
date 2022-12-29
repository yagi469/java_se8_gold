package q11;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		
		ZoneId.systemDefault();
//		ZoneId.getDefault();
//		ZonedDateTime.defaultTimeZone();
//		ZonedDateTime.getZone();
		
		// タイムゾーンの取得
		System.out.println(ZoneId.systemDefault()); // => Asia/Tokyo
	}
}
