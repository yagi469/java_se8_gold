package q16;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("");
		
//		Path path = FileSystems.toPath(file);
//		Path path = file.getPath();
//		Path path = Path.getPath(file);
		Path path = file.toPath();
	}
}
