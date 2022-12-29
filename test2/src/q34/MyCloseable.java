package q34;

import java.io.Closeable;
import java.io.IOException;

public class MyCloseable implements Closeable {
	public void close() throws IOException {
		System.out.println("MyCloseable");
	}
}