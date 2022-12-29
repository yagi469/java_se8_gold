package q19;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		OptionalInt opt = IntStream.of(1, 2, 3)
			.parallel()
			.findAny();
		System.out.println(opt.getAsInt());
	}
}
