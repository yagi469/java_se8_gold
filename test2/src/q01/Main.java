package q01;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream.of("Blue", "Red", "Yellow", "Green")
			.mapToInt(color -> color.length()) // line n1
			.filter(len -> len > 3)
			.limit(3)
			.forEach(System.out::print);
	}
}
