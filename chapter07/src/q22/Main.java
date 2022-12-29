package q22;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\abc\\xyz");
		Path p2 = Paths.get("C:\\xyz\\abc");
		System.out.println(p1.relativize(p2));
	}
}
