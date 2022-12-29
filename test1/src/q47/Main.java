package q47;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		UnaryOperator<Double> op = s -> s + 1.5;
		list.replaceAll(op);
		list.forEach(n -> System.out.print(n + " "));
	}
}
