package q03;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
//		Locale locale = new Locale("default");
//		Locale locale = Locale.systemDefault();
//		Locale locale = Locale.DEFAULT;
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
	}
}
