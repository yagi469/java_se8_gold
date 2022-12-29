package q16;

public class Main {

	public static void main(String[] args) {
		
		// A. 
//		Foo foo = (f, x) -> "#" + f.apply(x.length());
//		System.out.println(foo.doIt(x -> x + "$").apply("ABC"));
		
		// B. 
		Foo foo = f -> x -> "#" + f.apply(x.length());
		System.out.println(foo.doIt(x -> x + "$").apply("ABC"));
		
		// C. 
//		Foo foo = (f, x) -> "#" + f.accept(x.length());
//		System.out.println(foo.doIt(x -> x + "$").accept("ABC"));
		
		// D. 
//		Foo foo = f -> x -> "#" + f.accept(x.length());
//		System.out.println(foo.doIt(x -> x + "$").accept("ABC"));
		
	}
}