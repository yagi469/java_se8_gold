package q12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			
			// BufferedReaderクラスのlinesメソッドの利用
			br.lines().forEach(System.out::println);
			
			// Filesクラスのlinesメソッドの利用
//			Path path = Paths.get("sample.txt");
//			Files.lines(path).forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
