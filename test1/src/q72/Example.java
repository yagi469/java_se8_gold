package q72;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example {
	public static void main(String[] args) {
		method(Foo::new);
	}
	// line n1
	// A. 
	static void method(Supplier<? extends Foo> foo) {
		foo.get().doIt();
	}
	
	// B. 
//	static void method(Supplier<? extends Foo> foo) {
//		foo::doIt;
//	}
	
	// C. 
//	static void method(Consumer<? extends Foo> foo) {
//		foo.accept().doIt();
//	}
	
	// D. 
//	static void method(Function<? extends Foo> foo) {
//		foo.apply().doIt();
//	}
}