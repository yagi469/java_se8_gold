package q75;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// line n1
		// A.
//		list.removeAll(i -> i % 2 == 0);
		
		// B.
//		list.removeOf(i -> i % 2 == 0);
		
		// C.
		list.removeIf(i -> i % 2 == 0); 
		
		// D.
//		list.remove(i -> i % 2 == 0);
		
		System.out.println(list);
	}
}
