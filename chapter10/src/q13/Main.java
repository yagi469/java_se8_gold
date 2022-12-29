package q13;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("MyResources", Locale.US);
		System.out.println(rb.getString("message")); // => Hello
	}
}
