package q06;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] brics = { "Brazil", "Russia", "India", "China" };
		Arrays.sort(brics, (c1, c2) -> c1.compareTo(c2)); // line n1
		Arrays.stream() // line n2
			.forEach(country -> System.out.print(country + " "));
	}
}