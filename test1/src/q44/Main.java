package q44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Path[] files = { 
			Paths.get("data/log.txt"), 
			Paths.get("data/sales.csv"), 
			Paths.get("data/customer.xls") 
		};

		Stream.of(files) // line n1
			.filter(p -> p.toString().endsWith("csv"))
			.forEach(p -> {
				try {
					Files.readAllLines(p).stream().forEach(System.out::println); // line n2
				} catch (IOException e) {
					e.printStackTrace();
				}
		});
	}
}
