package q15;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Arrays.asList(2, 3, 1).stream()
			.sorted() // 自然順序で並べ替え
			.forEach(System.out::print); // => 123
		
		System.out.println();
		
		Arrays.asList(2, 3, 1).stream()
			.sorted((i, j) -> j - i) // 逆順に並べ替えるComparatorをラムダ式で記述
			.forEach(System.out::print); // => 321
	}
}
