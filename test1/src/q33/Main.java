package q33;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<CD> cdList = Arrays.asList(
			new CD("Sticky Fingers", 18.99), 
			new CD("Let It Bleed", 22.99)
		);

		Collections.sort(cdList, new CD());
		System.out.print(cdList);
	}
}
