package q24;

public class Main {

	public static void main(String[] args) {

		for (Stoplight s : Stoplight.values()) {
			System.out.println(s.name() + ": " + s.ordinal());
		}
	}
}
