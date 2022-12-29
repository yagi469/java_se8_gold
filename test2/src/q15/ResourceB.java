package q15;

public class ResourceB implements AutoCloseable {

	public void open() {
		System.out.print("Bo");
	}
	
	public void close() {
		System.out.print("Bc");
	}
}
