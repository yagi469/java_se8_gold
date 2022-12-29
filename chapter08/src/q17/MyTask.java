package q17;

import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
public class MyTask extends RecursiveTask<Integer> {
	
	@Override
	protected Integer compute() {
		try {
			Thread.sleep(2000); // 2秒待機
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyTask: OK");
		return 1;
	}
}