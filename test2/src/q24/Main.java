package q24;

import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {

		String str = "Java8"; 
		ToIntFunction<String> func = str::indexOf; // line n1
//		ToIntFunction<String> func = s -> str.indexOf(s);
		int x = func.applyAsInt("8"); //line n2 
		System.out.println(x);
	}
}
