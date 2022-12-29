package q11;

public class Foo {

	static {
		System.out.println(" static initializer");
	}
	
	{ System.out.println(" Initializer"); }

	Foo() {
		System.out.println(" constructor");
	}
}
