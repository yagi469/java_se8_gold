package q82;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private String message;

	public MyCallable(String message) {
		this.message = message;
	}

	public String call() throws Exception {
		return message.concat(" from MyCallable");
	}
}