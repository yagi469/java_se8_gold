package q77;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> { // line n1
// A.
//public class Sum implements Runnable<Integer> {
	
	private Integer val;

	public Sum(Integer i) {
		this.val = i;
	}

	public Integer call() throws Exception { // line n2
	// B.
//	public Integer submit() throws Exception {
		int sum = 0;
		for (long i = 1; i <= val; i++) {
			sum += i;
		}
		return sum;
	}
}