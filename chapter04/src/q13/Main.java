package q13;

import java.util.stream.IntStream;

public class Main {

	 public static void main(String[] args) {
		
		 IntStream.range(1, 5)
		 // insert code here
//		 .map(n -> n % 2 == 0)
//		 .mapToInt(n -> n % 2 == 0)
//		 .limit(n -> n % 2 == 0)
		 .filter(n -> n % 2 == 0)
		 .forEach(System.out::print);
	}
}
