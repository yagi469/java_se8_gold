package q06;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main2 {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3); // バリアの作成

		Runnable r = () -> {
			String threadName = Thread.currentThread().getName();
			try {
				System.out.println(threadName + ": start");
				Thread.sleep((int) (Math.random() * 5000));

				System.out.println(threadName + ": waiting..."); // バリアに到着
				barrier.await(); // バリアで待機

			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}

			System.out.println(threadName + ": end"); // 終了
		};

		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
}
