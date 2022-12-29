package q62;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;

	Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep((int)(Math.random() * 5000));
				System.out.println("taking " + queue.take() + " from the queue."); // line n2
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}