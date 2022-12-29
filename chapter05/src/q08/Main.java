package q08;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		try (MyResource resource = new MyResource()) {
			System.out.println("OK");
		}
	}
}

class MyResource implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("close");
	}
}
