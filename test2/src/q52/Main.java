package q52;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> op = (i1, i2) -> i1 * i2; // line n1
		BiFunction<Integer, Integer, Integer> func = op; // line n2
		System.out.println(func.apply(2, 3));
	}
}
