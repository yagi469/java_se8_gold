package q38;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2016, Month.OCTOBER, 1);
		MonthDay md = MonthDay.of(ld.getMonth(), ld.getDayOfMonth());
		System.out.println(md.equals(MonthDay.from(LocalDate.now())));
	}
}
