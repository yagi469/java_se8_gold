package q71;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 6, 7, 2, 4);
		// line n1
		// A.
//		Integer max = list.stream().max();
		
		// B.
//		Integer max = list.stream().max().get();
		
		// C.
		Integer max = list.stream().max((i, j) -> i - j).get();
		
		// D.
//		Integer max = list.stream().mapToInt(i -> i).max();
		
		System.out.println(max);
	}
}
