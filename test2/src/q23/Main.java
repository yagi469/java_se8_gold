package q23;

public class Main {

	public static void main(String[] args) {
		
		Bar bar = Foo::new; // line n1
//		Bar bar = i -> new Foo(i);
		bar.doIt(10); // line n2
	}
}

