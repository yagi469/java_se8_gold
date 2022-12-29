package q26;

public class PacketFilter implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Filter closed.");
	}

	public void filter() {
		System.out.println("filtering...");
	}
}