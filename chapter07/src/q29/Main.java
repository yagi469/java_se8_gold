package q29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {

		try (// Stream<String> stream = Files.streamLines(Paths.get("sample.txt"));
			 Stream<String> stream = Files.lines(Paths.get("sample.txt"));
			 // Stream<Path> stream = Files.streamLines(Paths.get("sample.txt"));
			 // Stream<Path> stream = Files.lines(Paths.get("sample.txt"));
			 ) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
