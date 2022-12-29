package q30;

import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")
public class MyAction extends RecursiveAction {

	@Override
	protected void compute() {
		System.out.println("OK");
	}
}
