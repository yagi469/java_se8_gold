package q26;

public class NetworkMonitor implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Monitor closed.");
	}

	public void monitor() throws Exception {
		System.out.println("Monitoring...");
		throw new Exception("Unable to monitor.");
	}
}