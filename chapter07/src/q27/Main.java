package q27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		long fileSize = Files.getSize("/var/tmp.txt");
		
//		long fileSize = FileSystems.getFileSize("/var/tmp.txt");
		
//		Path file = Paths.get("/var/tmp.txt");
//		long fileSize = (long)FileSystems.getAttribute(file, "filesize");
		
//		Path file = Paths.get("/var/tmp.txt");
//		long fileSize = (long)Files.getAttribute(file, "size");
	
		Path file = Paths.get("A\\x.txt");
		Long size = (Long)Files.getAttribute(file, "size");
		FileTime time = (FileTime)Files.getAttribute(file, "creationTime");
		
		System.out.println(size);
		System.out.println(time);
	}
}
