package q52;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Jonathan", "John", "Jonny");
		System.out.println(list.stream()
			.filter(s -> s.contains("Jon"))
			.reduce((s, t) -> s + t)
			.get()
		);
	}
}
