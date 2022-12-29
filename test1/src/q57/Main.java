package q57;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Item> itemList = Arrays.asList(
			new Item("ABC", 2500), 
			new Item("XYZ", 3200), 
			new Item("JJJ", 1800)
		);

		Predicate<Item> p = i -> i.getPrice() > 2000; // line n1
		itemList = itemList.stream()
			.filter(p)
			.collect(Collectors.toList());
		itemList.stream() // line n2
			.map(Item::getName) // line n3
			.forEach(n -> System.out.print(n + " "));
	}
}
