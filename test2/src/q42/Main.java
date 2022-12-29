package q42;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		int total = IntStream.of(1, 2, 3).sum();
		
		// A.
//		int total = IntStream.of(1, 2, 3).reduce(x -> x);
		
		// B.
//		int total = IntStream.of(1, 2, 3).reduce((x, y) -> x + y);
		
		// C.
//		int total = IntStream.of(1, 2, 3).reduce(0, (x, y) -> x + y);
		
		// D.
//		int total = IntStream.of(1, 2, 3).reduce(1, x -> x);

		System.out.println(total);
	}
}
