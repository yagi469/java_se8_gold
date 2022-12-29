package q24;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path src = Paths.get("sample.txt");
		Path dest = Paths.get("copy.txt");
//		Files.copy(src, dest, LinkOption.NOFOLLOW_LINKS);
		
		Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
		
		BasicFileAttributes attrs = Files.readAttributes(src, BasicFileAttributes.class);
		System.out.println(attrs.isRegularFile());
		
	
	}
}
