package q11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<String> future = service.submit(new MyCallable());
		System.out.println("Main: OK");
		System.out.println(future.get());
	}
}
