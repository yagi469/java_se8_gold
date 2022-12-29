package q17;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path path = Paths.get("c:\\x\\y\\z");
		System.out.printf("%s,%s,%s,%d", path.getRoot(), 
				path.getName(0), path.getFileName(), path.getNameCount());
	}
}
