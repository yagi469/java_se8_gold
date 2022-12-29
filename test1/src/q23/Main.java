package q23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<String> fourSeasons = Arrays.asList("Spring", "Summer", "Autumn", "Winter");

		Predicate<String> p1 = s -> s.length() > 5;
		Predicate<String> p2 = new StringFilter() { // line n1
			public boolean test(String str) {
				return str.contains("er");
			}
		};

		long count = fourSeasons.stream()
			.filter(p1)
			.filter(p2) // line n2
			.count();

		System.out.println(count);
	}
}
