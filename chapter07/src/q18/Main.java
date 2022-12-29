package q18;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		Path path = Paths.get("c:\\x\\y\\z");
		System.out.println(path.subpath(1, 2));
	}
}
