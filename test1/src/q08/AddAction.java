package q08;

import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")
public class AddAction extends RecursiveAction { // line n1

	private static final int THRESHOLD_SIZE = 3;
	private int start;
	private int end;
	private int[] numbers;

	public AddAction(int[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	protected void compute() { // line n2
		int total = 0;
		if (end - start <= THRESHOLD_SIZE) {
			for (int i = start; i < end; i++) {
				total += numbers[i];
			}
			System.out.print(total + " ");
		} else {
			new AddAction(numbers, start + THRESHOLD_SIZE, end).fork();
			new AddAction(numbers, start, Math.min(end, start + THRESHOLD_SIZE)).compute();
		}
	}
}