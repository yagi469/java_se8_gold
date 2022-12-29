package q62;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private int value = 1;
	private final BlockingQueue<Integer> queue;
	
	Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep((int)(Math.random() * 1000));
				System.out.println("putting " + value + " to the queue.");
				queue.put(value++); // line n1
				System.out.println("\t" + queue);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}