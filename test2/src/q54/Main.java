package q54;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	
	public static void main(String[] args) {
		
		AtomicInteger ai = new AtomicInteger(0);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(
				/* insert code here */
				// A. 
//				ai.getAndIncrement(2)
				
				// B. 
//				ai.getAndIncrement(x -> x + 2)
				
				// C. 
//				ai.getAndAccumulate(x -> x + 2)
				
				// D. 
				ai.getAndAccumulate(2, (x, y) -> x + y)
			);
		}		
	}
}