package q59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList()); // line n1
		List<?> list2 = new ArrayList<>(list1); // line n2
		Integer i = list2.get(0); // line n3
		System.out.println(i);
	}
}
