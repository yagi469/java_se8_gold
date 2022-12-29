package q30;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		try (Stream<Path> stream = Files.list(Paths.get("A"))) {

			stream.filter(Files::isRegularFile)
				.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
