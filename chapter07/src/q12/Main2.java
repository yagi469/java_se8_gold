package q12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * シリアライズされたオブジェクトの読み取り用実行クラス
 */
public class Main2 {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.ser"))) {

			Foo foo = (Foo)in.readObject();
			System.out.println(foo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
