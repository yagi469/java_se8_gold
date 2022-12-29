package q37;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		Duration d1 = ChronoUnit.YEARS.getDuration().multipliedBy(10); // line n1
		Duration d2 = ChronoUnit.DECADES.getDuration(); // line n2
		System.out.println(d1.equals(d2));
	}
}
