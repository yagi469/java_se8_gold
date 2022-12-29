package q65;

@FunctionalInterface
public interface Foo {

	abstract static void x(); // line n1
	default void y() {}; // line n2
	void z(); // line n3
	class Bar {} // line n4
}
