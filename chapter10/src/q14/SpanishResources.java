package q14;

import java.util.ListResourceBundle;

public class SpanishResources extends ListResourceBundle {
	
	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "Thank you", "Gracias" }, 
			{ "You're welcome", "De nada" } 
		};
	}
}