package q62;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] fruits = new String[] { "Orange", "Apple", "Strawberry" };
		// line n1
		// A. 
//		Arrays.sort(fruits, (LengthChecker::new).check);
		
		// B. 
//		Arrays.sort(fruits, (LengthChecker::new)::check);
		
		// C. 
		Arrays.sort(fruits, LengthChecker::check);
		
		// D. 
//		Arrays.sort(fruits, LengthChecker::new::check);
		
		System.out.println(Arrays.toString(fruits));
	}
}
