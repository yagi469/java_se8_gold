package q09;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		IntStream stream = Arrays.stream(array, 1, 4);
		stream.forEach(System.out::print);
	}
}
