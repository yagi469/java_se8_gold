package q05;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.of(2016, 9, 15);
		ld.withYear(2017);
		ld.withDayOfMonth(25);
		System.out.println(ld);
	}
}
