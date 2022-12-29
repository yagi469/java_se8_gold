package q13;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {

//		DateTimeFormatter formatter = new DateTimeFormatter("yyyy-MM-dd");
//		DateTimeFormatter formatter = new DateTimeFormatter().pattern("yyyy-MM-dd");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//		DateTimeFormatter formatter = DateTimeFormatter.getFormat("BASIC_ISO_DATE");
//		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
	}
}
