package q14;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		IntStream.range(1, 5)
		// insert code here
		.map(n -> n * 2)
//		.mapToInt(n -> n + 2)
//		.reduce(n -> n * 2)
//		.generate(n -> n + 2)
		.forEach(System.out::print);
	}
}
