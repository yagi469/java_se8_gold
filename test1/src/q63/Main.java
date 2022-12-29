package q63;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(
			new Person("John"), 
			new Person("Eric"), 
			new Person("Bill")
		);

		Stream<Person> stream = list.stream();
		// line n1
		// A. 
//		stream.forEach(System.out::print);
		
		// B. 
//		stream.forEachOrdered(System.out::print);
		
		// C. 
//		stream.map(p -> p.name).forEach(System.out::print);
		
		// D. 
		stream.map(Person::getName).forEach(System.out::print);
	}
}
