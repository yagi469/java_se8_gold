package q85;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		try (Stream<Path> stream = Files.list(Paths.get("dir"))) {
			System.out.println(
				stream.count()
			);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
