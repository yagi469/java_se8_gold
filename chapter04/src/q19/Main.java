package q19;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		IntPredicate p = i -> {
			System.out.print("even ");
			return i % 2 == 0;
		};

		boolean result = IntStream.of(1, 2, 3).allMatch(p);
		System.out.println(result);
	}
}
