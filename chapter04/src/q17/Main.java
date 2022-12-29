package q17;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("banana", "apple", "orange")
			.filter(e -> e.length() > 5)
			.peek(e -> System.out.print(e + " "))
			.map(String::toUpperCase)
			.peek(e -> System.out.print(e + " "));
		System.out.print("OK ");
		long count = stream.count();
	}
}
