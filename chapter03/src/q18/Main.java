package q18;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
//		Consumer<String> c = s -> System.out.println(s);
		Consumer<String> c = System.out::println;
		c.accept("Hello"); // => Hello
		
//		BinaryOperator<Integer> op = (x, y) -> Integer.max(x, y);
//		BinaryOperator<Integer> op = Integer::max;
//		System.out.println(op.apply(1, 2)); // => 2
		
//		Function<String, Integer> f = s -> new Integer(s);
//		Function<String, Integer> f = Integer::new;
//		Integer i = f.apply("1");
		
		
//		Function<String, Integer> f = s -> s.length();
//		Function<String, Integer> f = String::length;
//		System.out.println(f.apply("Hello")); // => 5
		
		String s1 = "Hello, ";
		Function<String, String> f = s2 -> s1.concat(s2);
//		Function<String, String> f = s::concat;
		System.out.println(f.apply("Java"));
		
		
		
	}
}
