package q57;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		// A.
//		Supplier<LocalDate> now = LocalDate::now();
		
		// B.
//		Supplier<LocalDate> now = () -> LocalDate::now;
		
		// C.
//		Supplier<LocalDate> now = LocalDate::new;
		
		// D.
		Supplier<LocalDate> now = LocalDate::now;
		
		System.out.println(now.get());
	}
}
