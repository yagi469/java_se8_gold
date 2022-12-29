package q18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Map;

public class MyListResourceBundle extends ListResourceBundle {

	// A.
//	public String[] getContents() {
//		return new String[] {
//			"Uno", "Dos", "Tres"	
//		};
//	}
	
	// B.
//	public List<String> getContents() {
//		return Arrays.asList("Uno", "Dos", "Tres");
//	}

	// C.
	public Object[][] getContents() {
		return new Object[][] { 
			{"1", "Uno"}, {"2", "Dos"}, {"3", "Tres"} 
		};
	}

	// D.
//	public Map<String, String> getContents() {
//		return new HashMap<String, String>() {
//			{put("1", "Uno");}
//			{put("2", "Dos");}
//			{put("3", "Tres");}
//		};
//	}

}
