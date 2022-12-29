package q04;

import java.util.Locale;

public class LocaleBuilderExample {

	public static void main(String[] args) {
		
		Locale locale = new Locale("123"); // 例外は発生しない
		
		Locale.Builder builder = new Locale.Builder();
		builder.setLanguage("123"); // 例外java.util.IllformedLocaleExceptionのスロー
		
	}
}
