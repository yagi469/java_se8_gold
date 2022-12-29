package q10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		try {
			
			Path file = Paths.get("sample.txt");
			
			// line n1
			// A. 
			Stream<String> stream = Files.lines(file);
			stream.forEach(s -> System.out.println(s));
			
			// B. 
//			List<String> stream = Files.list(file);
//			stream.stream().forEach(s -> System.out.println(s));
			
			// C. 
//			Stream<String> stream = Files.readAllLines(file);
//			stream.forEach(s -> System.out.println(s));
			
			// D. 
//			List<String> stream = Files.allLines(file);
//			stream.stream().forEach(s -> System.out.println(s));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
