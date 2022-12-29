package q24;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>(new LengthComparator());
		set.add("Charles");
		set.add("Bill");
		set.add("Alfred");
		System.out.println(set); // => [Bill, Alfred, Charles]
	}
}
