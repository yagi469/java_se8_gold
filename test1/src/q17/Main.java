package q17;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		Path p = Paths.get("/movies/sample/ex.mp4");
		System.out.println(p.getNameCount() + ":" + p.getName(1) + ":" + p.getFileName());
	}
}
