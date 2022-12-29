package q53;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Charles", "Jackie", "Eduard");
		System.out.println(
			stream.collect(Collectors.partitioningBy(s -> s.contains("ar")))
		);		
	}
}
