package q29;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Allan", 20);
		map.put("Bob", 30);
		map.put("Chris", 40);
		map.putIfAbsent("Allan", 50); 
		map.remove("Bob", 30);
		map.replaceAll((k, v) -> k.length() + v); // line n1
		System.out.println(map);
	}
}
