package q18;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("q18.MyListResourceBundle");
		System.out.println(rb.getString("1"));
	}
}
