package q21;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		
		// A.
//		Function<Double> func = x -> x * 0.5;
//		System.out.println(func.apply(3));
		
		// B.
//		DoubleFunction<Integer> func = x -> x * 0.5;
//		System.out.println(func.apply(3));
		
		// C.
//		DoubleFunction<Double> func = x -> x * 0.5;
//		System.out.println(func.applyAsDouble(3));
		
		// D.
		IntToDoubleFunction func = x -> x * 0.5;
		System.out.println(func.applyAsDouble(3));		
	}
}
