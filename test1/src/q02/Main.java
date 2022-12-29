package q02;

import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		IntStream s1 = IntStream.of(1, 2, 3);
		IntFunction<Integer> func = x -> y -> x + y; // line n1
		
		// A.
//		IntFunction<UnaryOperator> func = x -> y -> x + y;
		
		// B.
//		IntFunction<IntUnaryOperator> func = x -> y -> x + y;
		
		// C.
//		BiFunction<IntUnaryOperator> func = x -> y -> x + y;
				
		IntStream s2 = s1.map(func.apply(1)); // line n2
		
		// D.
//		Stream<Integer> s2 = s1.map(func.apply(1));
		
		// E.
//		IntStream s2 = s1.map(func.applyAsInt(1));
		
		s2.forEach(System.out::print);
	}
}
