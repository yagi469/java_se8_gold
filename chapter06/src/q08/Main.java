package q08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.of(2016, Month.APRIL, 1);
		LocalDateTime dt = LocalDateTime.from(d);
		System.out.println(dt);
		
		
		// 実行時に例外
//		System.out.println(LocalDateTime.from(LocalTime.now()));
//		System.out.println(LocalDateTime.from(LocalDate.now()));
		
		// 時間情報や日付情報が失われる
//		System.out.println(LocalDate.from(LocalDateTime.now())); // 時間情報なし
//		System.out.println(LocalTime.from(LocalDateTime.now())); // 日付情報なし
	
		// 時差情報、タイムゾーンの情報が失われる
//		OffsetDateTime odt = OffsetDateTime.now();
//		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt); // 時差およびタイムゾーンの情報付き
//		System.out.println(LocalDateTime.from(zdt)); // 時差およびタイムゾーンの情報なし
//		System.out.println(odt); // 時差情報付き
//		System.out.println(LocalDateTime.from(odt)); // 時差情報なし
		
	}
}
