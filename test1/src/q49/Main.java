package q49;

public class Main {

	public static void main(String[] args) throws Exception {

		User u1 = new User("Adam Ondra");
		User u2 = new User("Chris Sharm");
		User u3 = new User("Alex Megos");
		User u4 = new User("Ramon Julian");
		u4 = null;
		u3 = u2;
		System.out.println(User.getCount());
	}
}
