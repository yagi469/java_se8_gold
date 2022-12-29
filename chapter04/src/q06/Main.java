package q06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		IntStream stream = Arrays.stream(array);
		stream.forEach(str -> System.out.print(str));
		stream.forEach(str -> System.out.print(str));
	}
}
