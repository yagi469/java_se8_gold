package q11;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("MyResources-xxx");
		String message = rb.getString("key");
		System.out.println(message);
	}
}
