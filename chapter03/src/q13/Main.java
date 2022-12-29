package q13;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		// 匿名内部クラスによるConsumer<T>インタフェースの実装
//		Consumer<String> consumer = new Consumer<String>() {
//			public void accept(String str) {
//				System.out.println(str + "!");
//			}
//		};

		// ラムダ式によるConsumer<T>インタフェースの実装
		Consumer<String> consumer = str -> System.out.println(str + "!");

		// 実行
		consumer.accept("OK"); // => OK!
	}
}
