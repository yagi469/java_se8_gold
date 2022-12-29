package q50;

import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {
	
	private CyclicBarrier barrier;

	public Worker(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		try {
			System.out.println("Waiting...");
			barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}