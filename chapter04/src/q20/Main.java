package q20;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(
			Arrays.asList("Java", "Oracle"), 
			Arrays.asList("Lambda", "Java")
		);

		list.stream()
		// insert code here
//		.distinct()
//		.distinct(s -> s.equals("Java"))
//		.map().distinct()
		.flatMap(l -> l.stream()).distinct()
		.forEach(System.out::print);
	}
}
