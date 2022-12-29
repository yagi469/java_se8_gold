



import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
	
	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "resource", "MyResources.class" } 
		};
	}
}