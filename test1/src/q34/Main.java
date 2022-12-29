package q34;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> stream = Arrays.asList("Bill", "Eric", "Charles", "Alan").stream();
		System.out.println(
			// line n1
			// A. 
//			stream.count(s -> s.contains("r"))
			
			// B. 
			stream.filter(s -> s.contains("r")).count()

			// C. 
//			stream.map(s -> s.contains("r")).count()
			
			// D. 
//			stream.peek(s -> s.contains("r")).count().get()	
		);
	}
}
