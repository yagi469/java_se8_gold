package q56;

import java.util.concurrent.atomic.AtomicInteger;

public class Example {

	private static AtomicInteger counter = new AtomicInteger(0);

	static class Inc extends Thread {
		public void run() {
			System.out.print(counter.incrementAndGet());
		}
	}
	
	static class Dec extends Thread {
		public void run() {
			System.out.print(counter.decrementAndGet());
		}
	}
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 3; i++) {
			new Inc().start();
			new Dec().start();
		}		
	}
}
