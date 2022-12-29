package q39;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("A", "B", "C");
		String str = stream.parallel().reduce((a, b) -> a + "-" + b); // line n1
		System.out.println(str);  // line n2
	}
}
