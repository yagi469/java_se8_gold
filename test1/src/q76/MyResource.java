package q76;

import java.io.IOException;

public final class MyResource { // line n1

// A.
//public class MyResource extends Closeable {

// B.
//public class MyResource implements AutoCloseable {
	
	// line n2
	// C.
//	protected final void close() {
//		System.out.println("Close");
//	}
	
	// D.
//	public void close() throws IOException {
//		System.out.println("Close");
//	}
	
	public void open() {
		System.out.print("Open");
	}
}