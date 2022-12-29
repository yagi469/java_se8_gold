package q49;

public class Main {

	public static void main(String[] args) {

		String name = "John";
		Greeting g = n -> System.out.println("Hello, " + name);
		name = "Eric"; // line n2
		g.sayHello(name);
	}
}
