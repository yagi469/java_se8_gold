package q48;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> productList = Arrays.asList(
			"254, Rope", 
			"302, Quick draw", 
			"411, Harness"
		);

		productList.stream()
			.filter(s -> s.contains("2"))
			.sorted() // line n1
			.forEach(System.out::println); // line n2
	}
}
