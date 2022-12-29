package q67;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = { 
			new Employee("Doug", "Lee"), 
			new Employee("Steve", "House"),
			new Employee("Jack", "Johnson"), 
			new Employee("Doug", "Watkins"), 
			new Employee("Steve", "Miller") 
		};
		
		Comparator<Employee> sortByFirstName = 
				(e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
		Comparator<Employee> sortByLastName = 
				(e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
		
		// line n1
		// A.
//		Stream.of(employees)
//			.sorted(sortByFirstName.thenComparing(sortByLastName))
//			.forEach(System.out::println);
		
		// B.
//		Stream.of(employees)
//			.sorted(sortByFirstName.reversed().thenComparing(sortByLastName))
//			.forEach(System.out::println);
		
		// C.
		Stream.of(employees)
			.sorted(sortByFirstName.thenComparing(sortByLastName).reversed())
			.forEach(System.out::println);
		
		// D.
//		Stream.of(employees)
//			.sorted(sortByFirstName.reversed()
//				.thenComparing(sortByLastName).reversed())
//			.forEach(System.out::println);
	}
}
