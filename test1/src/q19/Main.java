package q19;

public class Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		Thread t3 = new Thread(new MyRunnable());

		Thread[] threads = { t1, t2, t3 };

		for (int i = 0; i < 3; i++) {
			threads[i].start();
		}
	}
}
