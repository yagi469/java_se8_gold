package q04;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.Builder builder = new Locale.Builder();
		builder.setLanguage("cat");
		builder.setRegion("ES");
		Locale locale = builder.build();
		
		// 上記の簡潔な記述例
//		new Locale.Builder()
//			.setLanguage("cat")
//			.setRegion("ES")
//			.build();
		
		System.out.println(locale);
	}
}
