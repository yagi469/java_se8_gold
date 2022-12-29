package q14;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("q14.SpanishResources");
		System.out.println(rb.getString("Thank you")); // => Gracias
		System.out.println(rb.getString("You're welcome")); // => De nada
	}
}
