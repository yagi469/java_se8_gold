package q21;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("A", "B");
		map.merge("A", "C", (v1, v2) -> v1.concat(v2));
		map.merge("B", "C", (v1, v2) -> v1.concat(v2));
		System.out.println(map);
	}
}
