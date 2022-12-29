package q45;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.of(2016, Month.APRIL, 1);
		// line n1
		// A. 
//		LocalDate ld2 = ld1.at(Month.SEPTEMBER);
		
		// B. 
//		LocalDate ld2 = ld1.of(ChronoUnit.MONTH, 9);
		
		// C. 
		LocalDate ld2 = ld1.with(ChronoField.MONTH_OF_YEAR, 9);
		
		// D. 
//		LocalDate ld2 = ld1.ofMonth(9);
		
		System.out.println(ld2);
	}
}
