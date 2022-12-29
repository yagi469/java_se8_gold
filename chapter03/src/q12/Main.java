package q12;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// 匿名内部クラスによるPredicate<T>インタフェースの実装
//		Predicate<String> predicate = new Predicate<String>() {
//			public boolean test(String str) {
//				return str.length() > 0;
//			}
//		};

		// ラムダ式によるPredicate<T>インタフェースの実装
		Predicate<String> predicate = str -> str.length() > 0;

		// 実行
		System.out.println(predicate.test("Java")); // => true
	}
}
