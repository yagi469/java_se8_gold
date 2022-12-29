package q02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
//		new LocalDate().getCurrent();
//		new LocalDate().today();
		LocalDate.now();
//		LocalDate.current();
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}
}
