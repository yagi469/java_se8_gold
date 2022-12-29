package q09;

public class Example {

	public static void main(String[] args) {

		try (MyResource r = new MyResource()) {
			System.out.println("OK");
		}
	}
}
