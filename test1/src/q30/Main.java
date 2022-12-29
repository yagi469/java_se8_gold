package q30;

public class Main {

	public static void main(String[] args) {

		Foo<String> fs = new Foo<>();
		Foo f = new Foo(); // line n1
		fs.set("John");
		f.set(1); // line n2
		System.out.print(f.get() + ":" + fs.get());
	}
}
