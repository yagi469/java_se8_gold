package q25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Album> albumList = Arrays.asList(
			new Album("Autumn In New York", "Tal Farlow"),
			new Album("Autumn In New York", "Jo Stafford"), 
			new Album("New Soil", "Jackie McLean")
		);

		List<Album> list = albumList.stream()
			// line n1
			// A. 
//			.map(Movie::getTitle).sorted(Comparator.reverseOrder())
			
			// B. 
//			.map(Movie::getTitle).sorted(Comparator.reverseOrder()
//			.map(Movie::getDirector).reversed()
			
			// C. 
			.sorted(Comparator.comparing(Album::getTitle).reversed()
			.thenComparing(Album::getArtist))
			
			// D. 
//			.sorted(Comparator.comparing(Album::getTitle)
//			.thenComparing(Album::getArtist))
			
			.collect(Collectors.toList());

		System.out.println(list);
	}
}
