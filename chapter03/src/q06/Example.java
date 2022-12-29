package q06;

public class Example {
	
	public static void main(String[] args) {
	
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("OK");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}