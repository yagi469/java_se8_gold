package q07;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2016, Month.APRIL, 1);
		LocalDate d2 = LocalDate.of(2017, Month.APRIL, 1);
		System.out.print(d1.isBefore(d2));
		System.out.print(d1.isAfter(d2));
		System.out.print(d1.isEqual(d2));
	}
}
