package q10;

public class Outer {
	
	private int value = 5;

	class Inner {
		private int value = new Outer().value + 5; // line n1
	}

	public static void main(String[] args) {
		System.out.println(new Outer().new Inner().value); // line n2
	}
}