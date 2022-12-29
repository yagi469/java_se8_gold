package q15;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Instant.now();
//		LocalDateTime.now().toInstant(;
		ZonedDateTime.now().toInstant();
//		Instant.toEpochMilli();
		Instant.ofEpochSecond(0);
		
		System.out.println(Instant.EPOCH); // => 1970-01-01T00:00:00Z
		System.out.println(Instant.now().toEpochMilli());
		System.out.println(Instant.now().getEpochSecond());
		
		
		Date date = new Date();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// DateオブジェクトからLocalDateTimeオブジェクトへの変換
		LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
}
