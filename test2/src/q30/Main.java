package q30;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool();
		// line n1
		// A.
		pool.invoke(new MyAction());
		
		// B.
//		pool.submit(new MyAction());

		// C.
//		pool.execute(new MyAction());
		
		// D.
//		pool.compute(new MyAction());
		
		System.out.println("Main");
	}
}
