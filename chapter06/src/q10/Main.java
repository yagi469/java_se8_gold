package q10;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Main {

	public static void main(String[] args) {

		LocalDate start = LocalDate.of(2016, Month.APRIL, 1);
		LocalDate end = LocalDate.of(2016, Month.APRIL, 10);
		// insert code here
		Temporal t = ChronoUnit.DAYS.addTo(start, 5);
		// insert code here
		long days = ChronoUnit.DAYS.between(start, end);
		
		System.out.println(t);
		System.out.println(days);
	}
}
