package q11;

public class ClassLoadExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("[Class loading]");
			Class.forName("q11.Foo", true, ClassLoadExample.class.getClassLoader());
			System.out.println("[Instantiation]");
			Foo foo = new Foo();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
