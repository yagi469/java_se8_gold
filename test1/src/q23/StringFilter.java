package q23;

public interface StringFilter {
	public default boolean test(String str) {
		return str.equals("n");
	}
}