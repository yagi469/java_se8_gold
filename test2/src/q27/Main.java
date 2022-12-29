package q27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Map<List<Integer>, List<String>>> list = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();
		list.add(null); // line n1
		list.add(map); // line n2
		list.forEach(System.out::print);
	}
}
	