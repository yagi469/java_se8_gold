package q13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		Runnable task = () -> { // Executorによって実行されるタスク（ラムダ式で実装）
			System.out.println("Task is executed.");
			System.out.println("[END]");
		};
		
		// Executorを使ったタスクの実行
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		executor.execute(task);
		
		// Executorを使ったタスクの実行と終了（shutdownメソッド）
		ExecutorService executor = Executors.newSingleThreadExecutor();
		System.out.println("[START]");
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
//		System.out.println("[SHUTDOWN]");
//		executor.shutdown();
		
		// Executorを使ったタスクの実行と終了（shutdownNowメソッド）
		System.out.println("[SHUTDOWN_NOW]");
		executor.shutdownNow();
	}
}
