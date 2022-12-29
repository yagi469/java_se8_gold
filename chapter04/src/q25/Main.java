package q25;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Double total = Arrays.asList(
			new Book("Java Programming", 25.20),
			new Book("Introduce Java 8", 22.98),
			new Book("Functional Programming pocket guide", 16.77)
		).stream()
			// insert code here
//			.reduce(Book::getPrice);
//			.reduce(b -> b.getPrice());
//			.collect(DoubleCollectors.sum(b -> b.getPrice()));
			.collect(Collectors.summingDouble(Book::getPrice));
		
		System.out.println(total);
	}
}
