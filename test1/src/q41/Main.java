package q41;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<Integer> s = Arrays.asList(7, 3, 5).stream();
		System.out.println(
			// line n1
			// A.
//			s.min()
			
			// B. 
//			s.map(n -> n).min()
			
			// C. 
//			s.map(Integer::min).get()
			
			// D. 
			s.min(Comparator.comparing(n -> n)).get()
		);
	}
}
