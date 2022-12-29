package q80;

import java.io.IOException;

// A.
//public class MyResource implements Closeable {
//	protected void close() /* throws IOException */ {
//		// body of close to release the resource
//	}
//}

// B.
//public class MyResource implements Closeable {
//	public void autoClose() /* throws IOException */ {
//		// body of close to release the resource
//	}
//}

// C.
//public class MyResource implements AutoCloseable {
//	void close() /* throws IOException */ {
//		// body of close to release the resource
//	}
//}

// D.
public class MyResource implements AutoCloseable {
	public void close() throws IOException {
		// ...
	}
}