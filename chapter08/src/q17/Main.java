package q17;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

	public static void main(String[] args) throws Exception {

//		doMyAction();
		doMytask();
	}

	static void doMyAction() throws Exception {

		ForkJoinPool executor = new ForkJoinPool();
		executor.execute(new MyAction());
		// executor.invoke(new MyAction());
		
		System.out.println("Main: OK");
		Thread.sleep(3000);
		System.out.println("Done");

	}

	static void doMytask() throws Exception {

		ForkJoinPool executor = new ForkJoinPool();
//		Integer result = executor.invoke(new MyTask());
		ForkJoinTask<Integer> result = executor.submit(new MyTask());
		
		System.out.println("Main: OK");
		Thread.sleep(3000);
//		System.out.println("Done:" + result);
		System.out.println("Done:" + result.get());
	}
}
