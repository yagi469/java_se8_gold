package q19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path p1 = Paths.get("C:\\abc");
		Path p2 = Paths.get("D:\\xyz");
		Path p3 = Paths.get("abc");
		System.out.println(p1.resolve(p2).resolve(p3));
	}
}
