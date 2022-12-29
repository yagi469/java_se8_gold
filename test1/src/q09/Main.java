package q09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<List<String>> s1 = Stream.of(
			Arrays.asList("1", "Bill"), 
			Arrays.asList("2", null)
		);

		Stream<String> s2 = s1.flatMapToInt((x) -> x.stream());
		s2.forEach(System.out::print);
	}
}
