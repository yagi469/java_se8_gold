package q55;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> p = x -> x > 5;
		IntStream s = IntStream.of(3, 7, 1, 9, 5); 
		System.out.println(s.anyMatch(p)); // line n1
		
	}
}
