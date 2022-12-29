package q15;

public class ResourceA implements AutoCloseable {

	public void open() {
		System.out.print("Ao");
	}
	
	public void close() {
		System.out.print("Ac");
	}
}
