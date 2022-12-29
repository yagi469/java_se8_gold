package q70;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		try (Stream<String> lines = Files.lines(Paths.get("sample.txt"))) {
			lines
				.flatMap(line -> Arrays.stream(line.split(" ")))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
				.entrySet().stream().sorted(Entry.comparingByValue())
				.forEach(e -> System.out.print(e.getKey()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
