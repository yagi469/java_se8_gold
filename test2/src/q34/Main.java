package q34;

import java.io.Closeable;

public class Main {

	public static void main(String[] args) {

		try (Closeable closeableImpl = new MyCloseable(); 
			 AutoCloseable autoCloseableImpl = new MyAutoCloseable()) {
		} catch (Exception e) {
			System.out.println("exception");
		} finally {
			System.out.println("finally");
		}
	}
}
