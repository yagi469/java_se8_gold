package q03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Arrays.asList(1, 2, 3).stream()
			.map(x -> x + 1) // line n1
			.peek(System.out::print) // line n2
			.count(); // line n3
	}
}
