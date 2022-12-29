package q61;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		UnaryOperator<Integer> op = n -> n * 2; // line n1
		List<Double> list = Arrays.asList(1.5, 2.2, 3.5);
		list.stream()
			.filter(d -> d > 2.0)
			.map(d -> op.apply(d)) // line n2
			.forEach(n -> System.out.print(n + " "));
	}
}
