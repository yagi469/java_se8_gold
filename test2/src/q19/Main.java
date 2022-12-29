package q19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		int x = IntStream.of(1, 2, 3).map(i -> 1).sum();
		
		// A.
//		int x = IntStream.of(1, 2, 3).total();
		
		// B.
//		int x = IntStream.of(1, 2, 3).distinct();
		
		// C.
		long x = IntStream.of(1, 2, 3).count();
		
		// D.
//		int x = IntStream.of(1, 2, 3).limit();
		
		System.out.println(x);
	}
}
