package q22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList (
			new Employee ("Paul", "Accountant", "CA"),
			new Employee ("Philip", "Sales", "NY"),
			new Employee ("Francis", "Sales", "CA")
		);
		
		empList.stream()
			.collect(Collectors.groupingBy(Employee::getDept))
			.forEach((k, e) -> System.out.println(e));
	}
}
