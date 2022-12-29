package q36;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		long count = Stream.of("C", "A", "B", "A", "B", "C", "A")
			.filter(s -> s.equals("B")) // line n1
			
			// A. 
//			.filter(Predicate.isEqual("B"))
			
			// B. 
//			.filter(Predicate::isEqual("B"))
			// C. 
//			.filter(Predicate.equals("B"))
			
			// D. 
//			.filter(Predicate::equals("B"))
			
			.count();
		System.out.println(count);
	}
}
