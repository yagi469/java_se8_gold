package q10;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		IntStream.range(1, 5) // 1 ～ 4までの数値範囲ストリーム
			.forEach(System.out::print); // => 1234
		
		System.out.println();
		
		IntStream.rangeClosed(1, 5) // 1 ～ 5までの数値範囲ストリーム
			.forEach(System.out::print); // => 12345
	}
}
