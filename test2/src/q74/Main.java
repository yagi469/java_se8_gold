package q74;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<List<List<String>>> list = Arrays.asList(
			Arrays.asList(
				Arrays.asList("A", "B"), 
				Arrays.asList("C", "D", "E"), 
				Arrays.asList("F")),
			Arrays.asList(
				Arrays.asList("e", "a", "d"), 
				Arrays.asList("c", "f"))
		);

		list.stream()
			.flatMap(Collection::stream) 
			.filter(l -> l.size() > 2)
//			.flatMap(Collection::stream) 
			.map(String::toLowerCase) // line n1
			.distinct() // line n2
			.forEach(System.out::print);
	}
}
