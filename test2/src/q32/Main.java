package q32;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> map = new HashMap<>();
		map.put("Y", "A");
		map.put("X", "a");
					
		map.entrySet().stream()
		  .sorted(Map.Entry.comparingByValue())
		  .forEach(System.out::println);
	}
}
