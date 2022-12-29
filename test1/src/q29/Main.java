package q29;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (FileInputStream in = new FileInputStream("cert.txt");
			 InputStreamReader reader = new InputStreamReader(in)) {
			
			int ch;
			while (reader.ready()) {
				reader.skip(3); // line n1
				ch = reader.read(); // line n2
				System.out.print((char) ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
