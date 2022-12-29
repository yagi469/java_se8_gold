package q26;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 3;
		Arrays.asList(1, 2, 3, 4, 5).stream()
			.filter(p1.and(p2).negate()) // line n1
			.forEach(System.out::print);
	}
}
