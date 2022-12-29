package q12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2016, Month.APRIL, 1);
		LocalDate end = LocalDate.of(2016, Month.APRIL, 5);
		
//		Duration.distance(start, end);
//		System.out.println(Duration.between(start, end));
//		Period.distance(start, end);
		System.out.println(Period.between(start, end).getDays());
	}
}
