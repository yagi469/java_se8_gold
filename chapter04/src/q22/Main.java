package q22;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		System.out.printf("個数: %d\n", IntStream.of(1, 2, 3).count());
		System.out.printf("平均: %.1f\n", IntStream.of(1, 2, 3).average().getAsDouble());
		System.out.printf("最大: %d\n", IntStream.of(1, 2, 3).max().getAsInt());
		System.out.printf("最小: %d\n", IntStream.of(1, 2, 3).min().getAsInt());
		System.out.printf("合計: %d\n", IntStream.of(1, 2, 3).sum());
	}
}
