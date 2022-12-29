package q20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("B", 1);
		map.put("C", 2);
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet); // line n1
		Collections.sort(entryList, (e1, e2) -> e2.getValue() - e1.getValue()); // line n2
		
		System.out.println(entryList);
	}
}
