package q14;

public class Example {
	
	interface X { }
	interface Y extends X { }
	interface Z extends Y { }

	static class A<T> {	}
	static void doIt(A<? super Y> arg) {}

	public static void main(String[] args) {
		doIt(new A<X>()); // line n1
		doIt(new A<Y>()); // line n2
		doIt(new A<Z>()); // line n3
		doIt(new A()); // line n4
	}
}