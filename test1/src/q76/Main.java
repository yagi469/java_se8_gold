package q76;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		try (MyResource resource = new MyResource()) {
			resource.open();
		}
	}
}
