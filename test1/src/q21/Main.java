package q21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path src = Paths.get("DATA/JAN/log.txt");
		Path dest = Paths.get("DATA");
		Files.copy(src, dest);
	}
}
