package q08;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 10);
		LocalDate ld2 = LocalDate.of(2020, Month.OCTOBER, 10);
		
		// line n1
		// A.
		int years = Period.between(ld1, ld2).getYears();
		
		// B. 
//		Long years = Duration.between(ld1, ld2).ofYears();
		
		// C.
//		Period years = Period.between(ld1, ld2).getYears();
		
		// D.
//		Duration years = Duration.between(ld1, ld2).ofYears();
		
		// E.
//		Instant years = new Instant().between(ld1, ld2).getYears();

		System.out.println(years);
	}
}
