package q50;

import java.util.concurrent.CyclicBarrier;

public class Main {

	public static void main(String[] args) {
		
		Runnable runner = new Runner();
		//line n1
		// A. 
//		CyclicBarrier barrier = new CyclicBarrier(1);
//		Thread worker = new Worker(runner);
		
		// B. 
//		CyclicBarrier barrier = new CyclicBarrier(2);
//		Thread worker = new Worker(runner);
		
		// C. 
		CyclicBarrier barrier = new CyclicBarrier(1, runner);
		Thread worker = new Worker(barrier);
		
		// D. 
//		CyclicBarrier barrier = new CyclicBarrier(2, runner);
//		Thread worker = new Worker(barrier);
		
		worker.start();
	}
}
