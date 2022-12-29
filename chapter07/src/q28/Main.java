package q28;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

	public static void main(String[] args) throws IOException {

		// print(new File("A"));

		Path path = Paths.get("A");
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				System.out.println(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
				System.out.println(file);
				return FileVisitResult.CONTINUE;
			}
		});
	}

	/**
	 * ディレクトリの再帰処理
	 */
	public static void print(File file) {
		System.out.println(file.getPath());
		File[] fileList = file.listFiles();
		if (fileList != null) {
			for (File f : fileList) {
				print(f);
			}
		}
	}
}
