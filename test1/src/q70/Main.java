package q70;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		int ch = 0;
		try (FileReader reader = new FileReader("sample.txt")) {
			// line n1
			// A. 
//			while((ch = reader.read()) != null) {
			
			// B. 
			while((ch = reader.read()) != -1) {
			
			// C. 
//			while((ch = reader.read()) != 0) {
			
			// D. 
//			while((ch = reader.read()) != FileReader.EOF) {
			
				System.out.print((char)ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
