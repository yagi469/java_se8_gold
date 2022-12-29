package q12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> itemMap = new HashMap<>();
		itemMap.put("A", 200);
		itemMap.put("B", 150);
		itemMap.put("C", 300);
		
		String result = itemMap.stream()
//		String result = itemMap.entrySet().stream()
			.filter(m -> m.getValue() >= 200)
			.map(m -> m.getKey())
			.collect(Collectors.joining());
		System.out.println(result);
	}
}
