package q59;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		BiFunction<Integer, Double, Integer> f = (n1, n2) -> n1 + n2;
		System.out.println(f.apply(1, 2.5));
	}
}
