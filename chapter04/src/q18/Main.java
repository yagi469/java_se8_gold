package q18;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		IntPredicate p = n -> n == 1;

		System.out.println(IntStream.of(1, 2, 3).allMatch(p)); // => false
		System.out.println(IntStream.of(1, 1, 1).allMatch(p)); // => true

		System.out.println(IntStream.of(1, 2, 3).anyMatch(p)); // => true
		System.out.println(IntStream.of(2, 3, 4).anyMatch(p)); // => false

		System.out.println(IntStream.of(1, 2, 3).noneMatch(p)); // => false
		System.out.println(IntStream.of(2, 3, 4).noneMatch(p)); // => true
	}
}
