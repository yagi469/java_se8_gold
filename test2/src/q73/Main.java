package q73;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Arrays.asList("a;b;c", "", "x;y").stream()
			.flatMap(str -> Arrays.stream(str.split(";"))) // line n1
			.forEach(str -> System.out.print(str + ":"));
	}
}
