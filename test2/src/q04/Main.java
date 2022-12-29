package q04;

import java.util.concurrent.CyclicBarrier;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("Let's go"); // line n1
		final CyclicBarrier barrier = new CyclicBarrier(3, r1); // line n2
		Runnable r2 = () -> {
			System.out.println("Awaiting...");
			try {
				barrier.await();
			} catch (Exception e) { }
		};
		
		new Thread(r2).start();
		new Thread(r2).start();
		new Thread(r2).start();
	}
}
