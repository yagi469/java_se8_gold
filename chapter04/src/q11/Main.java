package q11;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		X x = new X();
		Y y = new Y();

		// x.stream(y);
		Stream.of(x, y);
//		Stream.getStream(x, y);
//		Object.getStream(x).getStream(y);
	}
}

class X {
}

class Y {
}
