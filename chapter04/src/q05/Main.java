package q05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("A", "B", "C");
		
		// ラムダ式（メソッド参照）による実装
//		Stream<String> stream = list.stream();
//		stream.forEach(System.out::print); // => ABC

		// 匿名内部クラスによる実装
//		Consumer<String> action = new Consumer<String>() {
//			public void accept(String str) {
//				System.out.print(str);
//			}
//		};
//
//		Stream<String> stream = list.stream();
//		stream.forEach(action); // => ABC

		// IterableインタフェースのforEachメソッドを利用
		Arrays.asList("A", "B", "C")
			.forEach(System.out::print); // => ABC
	}
}
