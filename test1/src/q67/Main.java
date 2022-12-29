package q67;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path p1 = Paths.get("/x/./y/");
		Path p2 = p1.resolve("z");
		Path p3 = Paths.get("/alpha/beta/");
		Path p4 = p3.resolve("/gamma/");
		System.out.println(p2);
		System.out.println(p4);
		// 注） 「/」はWindowsでは「\」として表示
	}
}
