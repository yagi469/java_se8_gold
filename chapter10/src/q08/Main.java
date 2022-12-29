package q08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		try (InputStream in = new FileInputStream("example.properties")) {

			Properties props = new Properties();
			props.load(in);

//			for (Map.Entry prop : props.getEntry()) {
//				System.out.println(prop.getKey() + ":" + prop.getValue());
//			}

//			for (Properties prop : props.getAllProperties()) {
//				System.out.println(prop.getKey() + ":" + prop.getValue());
//			}

			props.list(System.out); // OK

			props.forEach((k, v) -> System.out.println(k + ":" + v)); // OK
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
