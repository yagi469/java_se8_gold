package q69;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Bob", "John", "Paul");
		Predicate<String> p = str -> {
			System.out.print("testing...");
			return str.contains("Bob");
		};

		System.out.print(
			nameList.stream()
				.filter(s -> s.length() > 3)
				.allMatch(p));
	}
}
