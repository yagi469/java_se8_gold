package q19;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable {

	private static AtomicInteger value = new AtomicInteger(0);

	public void run() {
		System.out.print(value.incrementAndGet());
	}
}