package q11;

import java.io.File;
import java.io.IOException;

public class Example {
	
	public static void main(String[] args) {
		try {
			deleteForTemporaryFiles("App");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteForTemporaryFiles(String dir) throws IOException {
		
		File[] files = new File(dir).listFiles();

		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					deleteForTemporaryFiles(file.getAbsolutePath());
				} else {
					if (file.getName().endsWith(".tmp")) {
						file.delete();
					}
				}
			}
		}
	}
}
