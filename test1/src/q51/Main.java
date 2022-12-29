package q51;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {

		String str = "Write Once, Run Anywhere.";
		// line n1
		// A. 
//		Function<String> f = str::indexOf;
//		int result = f.applyAsInt("Run");
		
		// B. 
		Function<String, Integer> f = str::indexOf;
		int result = f.apply("Run");
		
		// C. 
//		IntFunction<String> f = str::indexOf;
//		int result = f.apply("Run");
		
		// D. 
//		IntFunction<String> f = str::indexOf;
//		int result = f.applyAsInt("Run");
		
		// E. 
//		ToIntFunction<String> f = str::indexOf;
//		int result = f.applyAsInt("Run");
		
		if (result != -1) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
