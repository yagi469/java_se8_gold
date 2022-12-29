package q14;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		// 匿名内部クラスによるFunction<T, R>インタフェースの実装
//		Function<String, String> function = new Function<String, String>() {
//			public String apply(String str) {
//				return str.toUpperCase();
//			}
//		};

		// ラムダ式によるFunction<T, R>の実装
		Function<String, String> function = str -> str.toUpperCase();

		// 実行
		System.out.println(function.apply("java")); // => JAVA
	}
}
