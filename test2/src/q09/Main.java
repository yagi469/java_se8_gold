package q09;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Double, Integer> c = (i, d) -> i * d; // line n1
		double result = c.apply(2, 1.2); // line n2
		System.out.println(result);

	}
}
