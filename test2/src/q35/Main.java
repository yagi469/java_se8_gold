package q35;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

class Main {

	public static void main(String[] args) {
		
		IntUnaryOperator f1 = i -> i * 2;
		IntUnaryOperator f2 = i -> i + 2;
		IntStream.of(0, 1, 2)
			.map(f1.compose(f2)) // line n1
			.forEach(System.out::print);
		
	}
}
