package q04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new FileReader("sample.txt"));
			 BufferedWriter out = new BufferedWriter(new FileWriter("copy.txt"))) {
			
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
