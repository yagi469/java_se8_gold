package q07;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.forEach(
//			e -> System.out.prntln(e.getKey() + e.getValue())
//			e -> System.out.prntln(System.out::println)
//			(k, v) -> System.out::println
			(k, v) -> System.out.print(k + v)
		);
	}
}
