package q49;

public class User {

	private String name;
	private static int count;

	static {
		count = 0;
	}

	public User(String name) {
		this.name = name;
		++count;
	}

	public static int getCount() {
		return count;
	}
}