package q10;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
//		ResourceBundle rb = new ResourceBundle("MyResources");
//		ResourceBundle rb = new ResourceBundle("MyResources.properties");
//		ResourceBundle rb = ResourceBundle.getBundle("MyResources.properties");
		ResourceBundle rb = ResourceBundle.getBundle("MyResources");
		
		System.out.println(rb.getString("A"));
	}
}
