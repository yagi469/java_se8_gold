package q77;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Callable<Integer> task = new Sum(10);
		
		Executor executor = Executors.newSingleThreadExecutor(); // line n3
		// C.
//		ExecutorService executor = Executors.newSingleThreadExecutor(); 
		
		Future<Integer> future = executor.call(task); // line n4
		// D.
//		Future<Integer> future = executor.submit(task); 
		
		System.out.println(future.get());
		executor.shutdown();
	}
}
