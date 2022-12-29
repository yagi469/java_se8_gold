package q06;

public class Main {

	public static void main(String[] args) {
		
//		Runnable r = {} -> System.out.println();
//		Runnable r = {} => System.out.println();
		Runnable r = () -> System.out.println();
//		Runnable r = () => System.out.println();
		
		Thread t = new Thread(r);
		t.start(); // 実行するだけでこの例では何も表示されない
	}
}
