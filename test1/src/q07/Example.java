package q07;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example {

	public static void main(String[] args) {
		execute(() -> new Parent());
		execute(Child::new);
	}

	// line n1
	// A.
//	static void execute(Consumer<Parent> parent) {
//		parent.accept().doIt();
//	}

	// B.
	static void execute(Supplier<Parent> parent) {
		parent.get().doIt();
	}

	// C.
//	static void execute(Consumer<? extends Parent> parent) {
//		parent::doIt();
//	}

	// D.
//	static void execute(Supplier<? extends Parent> parent) {
//		parent::doIt();
//	}

}