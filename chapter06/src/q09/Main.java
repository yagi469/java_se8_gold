package q09;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		// 4月1日に10日加算する
		LocalDate d = LocalDate.of(2016, Month.APRIL, 1);
		System.out.println(d); // => 2016-04-01
		System.out.println(d.plus(10, ChronoUnit.DAYS)); // => 2016-04-11
	}
}
