package q17;

import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")
public class MyAction extends RecursiveAction {
	
	@Override
	protected void compute() {
		try {
			Thread.sleep(2000); // 2秒待機
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyAction: OK");
	}
}