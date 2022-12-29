package q02;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger count = new AtomicInteger();

	/**
	 * 現在のcountの値をカウントアップし、その値を返す。
	 */
	public int getCount() {
		return count.incrementAndGet();
	}
}