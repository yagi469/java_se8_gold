package q11;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		// 匿名内部クラスによるSupplier<T>インタフェースの実装
//		Supplier<String> supplier = new Supplier<String>() {
//			public String get() {
//				return "OK";
//			}
//		};

		// ラムダ式によるSupplier<T>インタフェースの実装
		Supplier<String> supplier = () -> "OK";

		// 実行
		System.out.println(supplier.get()); // => OK
	}
}
