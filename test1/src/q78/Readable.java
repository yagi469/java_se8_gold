package q78;

public interface Readable<Integer> {

	public default void read(Integer b) {
		System.out.println("Reading:" + b);
	}

	public void skip(Integer b);
}