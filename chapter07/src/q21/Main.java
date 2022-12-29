package q21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\abc\\def\\..\\..\\xyz\\.\\tmp.txt");
		System.out.println(path.normalize());
	}
}
