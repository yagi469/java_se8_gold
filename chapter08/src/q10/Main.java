package q10;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		// 従来のThreadクラスを使用したタスクの実行
//		Runnable task = new MyTask(); // タスクの生成
//		Thread thread = new Thread(task); // スレッドの生成
//		thread.start(); // スレッドの実行（およびタスクの実行）
		
		// MyExecutorを使用したタスクの実行
//		Runnable task = new MyTask(); // タスクの生成
//		Executor executor = new MyExecutor(); // 具象Executorの生成
//		executor.execute(task); // タスクの実行
		
		// Executorsのファクトリー・メソッドを使用
		Runnable task = new MyTask(); // タスクの生成
		Executor executor = Executors.newScheduledThreadPool(3);
		executor.execute(task); // タスクの実行
		
		
	}
}
