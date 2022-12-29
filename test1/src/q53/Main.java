package q53;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Al", "Bob", "Cale");
		Function<String, Integer> f = String::length; // line n1
		list.stream()
			.map(f)
			.peek(System.out::print);
	}
}
