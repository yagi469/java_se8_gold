package q16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>(Comparator.comparing(Employee::getId));
		set.add(new Employee(3, "John"));
		set.add(new Employee(1, "Bill"));
		set.add(new Employee(2, "Eric"));
		System.out.println(set);
	}
}
