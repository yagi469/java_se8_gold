package q46;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String args[]) {

		Locale.setDefault(new Locale("en", "US"));
		// 紙面のコードではパッケージ名「q46」を省略しています
		ResourceBundle rb = ResourceBundle.getBundle("q46.MyResources");
		String key = rb.getString("key");
		System.out.println(key);
	}
}
