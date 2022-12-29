package q06;

public class Main1 {

	public static void main(String[] args) {

		Runnable r = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ": start"); // 開始
			try {
				Thread.sleep((int) (Math.random() * 5000)); // ランダム秒待機
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + ": end"); // 終了
		};

		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
}
