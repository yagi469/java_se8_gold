package q17;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// A. 
//		OffsetDateTime utc = OffsetDateTime.now(ZoneId.UTC);
//		Date date = Date.of(utc);
		
		// B. 
//		ZonedDateTime utc = ZonedDateTime.of(ZoneId.getUTC());
//		Date date = Date.of(utc.toEpoch());
		
		// C. 
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		Date date = Date.from(utc.toInstant());
		
		// D. 
//		OffsetDateTime utc = OffsetDateTime.of(ZoneOffset.getUTC());
//		Date date = Date.from(utc);

	}
}
