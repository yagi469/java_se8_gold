package q72;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		NullableObject obj = new NullableObject(Optional.ofNullable(null)); // line n1
		Optional<String> str = obj.getStr();
		str.ifPresent(System.out::println).orElse("Empty"); // line n2
	}
}
