package q17;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		// 匿名クラスによるBinaryOperator<T>インタフェースの実装
//		BinaryOperator<Integer> add = new BinaryOperator<Integer>() {
//			public Integer apply(Integer value1, Integer value2) {
//				return value1 + value2;
//			}
//		};
		
		// ラムダ式によるBinaryOperator<T>インタフェースの実装
		BinaryOperator<Integer> add = (i1, i2) -> i1 + i2;
		
		// 実行
		System.out.println(add.apply(1, 2)); // => 3 (1 + 2と同じ)
	}
}
