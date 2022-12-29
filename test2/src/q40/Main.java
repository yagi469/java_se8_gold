package q40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			 BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) { 
			
			String str = null;
			while ((str = reader.readLine()) != null) {
				writer.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
