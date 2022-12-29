package q33;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<String> words = Stream.of("one", "two", "three");
		int len = words.map(String::length) // line n1
			.reduce(0, (x, y) -> x + y); // line n2
		System.out.println(len);
	}
}
