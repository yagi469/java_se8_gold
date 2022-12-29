package q18;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Arrays.asList(1, 2, 3).parallelStream()
			.map(n -> n * 2)
//			.sequential() // 順次ストリームに変換
			.forEach(System.out::print);
	}
}
