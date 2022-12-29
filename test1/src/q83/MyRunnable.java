package q83;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {

	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name);
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		ExecutorService executor = Executors.newCachedThreadPool();
		Files.walk(Paths.get("App")).forEach(path -> {
			Runnable r = new MyRunnable(path.getFileName().toString());
			executor.execute(r); // line n1
		});
		executor.shutdown();
		executor.awaitTermination(3, TimeUnit.MINUTES); // line n2
	}
}