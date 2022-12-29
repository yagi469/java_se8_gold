package q79;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "B");
		map.put(2, "A");
		map.entrySet().stream()
		  .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())) // line n1
		  .forEach(System.out::println);
	}
}
