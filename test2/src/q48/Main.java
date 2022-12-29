package q48;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream.of(1, 2, 3)
			.peek(System.out::print)
			.map(i -> i * i)
			.peek(System.out::print) // line n1
			.count(); // line n2
	}
}
