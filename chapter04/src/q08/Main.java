package q08;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[0];
		
//		Stream<int> stream = array.stream();
//		Stream<Integer> stream = array.stream();
		IntStream stream = Arrays.stream(array);
//		IntStream stream = Stream.getIntStream(array);
	}
}
