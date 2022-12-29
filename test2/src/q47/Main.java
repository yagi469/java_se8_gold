package q47;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		Iterator<String> it = set.iterator();
		set.add("C");
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		set.forEach(System.out::print);
	}
}
