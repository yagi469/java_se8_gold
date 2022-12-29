package q34;

public class MyAutoCloseable implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("MyAutoCloseable");
	}
}