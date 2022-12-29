package q18;

public class Outer {

	static class X { } // n1

	private class Y { } // n2

	public void doIt() {
		class Z { } // n3
	}
}
