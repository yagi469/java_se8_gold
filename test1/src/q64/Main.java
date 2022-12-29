package q64;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
			// line n1
			// A. 
			.flatMap(list -> list.stream())
			
			// B. 
//			.flatMap(list -> list.intStream())
		
			// C. 
//			.flatMapToInt(list -> list.stream())
		
			// D. 
//			.flatMapToInt(list -> list.flatMapToInt())
			
			.forEach(s -> System.out.print(s + " "));
	}
}
