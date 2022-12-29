package q61;

public class Main {

	public static void main(String[] args) {
		
		// line n1
		// A. 
//		Foo<String>[] foo = String::new;
		
		// B. 
//		Foo<String>[] foo = String::new[];
		
		// C. 
		Foo<String[]> foo = String[]::new;
		
		// D. 
//		Foo<String[]> foo = String::new[];

		String[] array = foo.doIt(3);
	}
}
