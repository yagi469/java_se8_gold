package q51;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Book[] books = { 
			new Book("Java Cookbook", 25.20), 
			new Book("Beginning Java 8", 22.98),
			new Book("Java Pocket Guide", 16.77) 
		};
		
		// line n1
		// A. 
//		Double total = books.stream()
//			.collect(Collectors.sum(Book::getPrice));
		
		// B.
//		Double total = books.stream()
//			.reduce(Collectors.sumToDouble(book -> book.getPrice()));
		
		// C.
		Double total = Arrays.stream(books)
			.collect(Collectors.summingDouble(Book::getPrice));
		
		// D.
//		Double total = Arrays.stream(books)
//				.reduce(Collectors.summing(book -> book.getPrice()));
		
		System.out.println(total);

	}
}
