package q07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		try (InputStream in = new FileInputStream("example.properties")) {

			Properties props = new Properties();
			// n1
			// n2
			
//			props.read(in);
//			System.out.println(props.getValue("A"));
			
//			props.read(in);
//			System.out.println(props.getProperty("A"));
			
//			props.load(in);
//			System.out.println(props.getValue("A"));
			
			props.load(in);
			System.out.println(props.getProperty("A"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
