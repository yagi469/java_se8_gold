package q16;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		// 匿名クラスによるUnaryOperator<T>インタフェースの実装
//		UnaryOperator<Integer> inc = new UnaryOperator<Integer>() {
//			public Integer apply(Integer i) {
//				return i + 1;
//			}
//		};
		
		// ラムダ式によるUnaryOperator<T>インタフェースの実装
		UnaryOperator<Integer> inc = i -> i + 1;
		
		// 実行
		System.out.println(inc.apply(1)); // => 2 (++1と同じ)
	}
}
