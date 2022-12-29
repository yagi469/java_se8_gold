package q82;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		String str = Stream.of("java", "oracle", "1z0-809")
			// line n1
			//A. 
//			.collect(Collectors.adding("[", "]"));
		
			// B. 
			.collect(Collectors.joining(", ", "[", "]"));
		
			// C. 
//			.collect(Collectors.adapting("[", "]"));
		
			// D. 
//			.collect(Collectors.mixing(", ", "[", "]"));

		System.out.println(str);
	}
}
