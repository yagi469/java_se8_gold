package q12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * オブジェクトのシリアライズを行う書き込み用実行クラス
 */
public class Main {

	public static void main(String[] args) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.ser"))) {

			Foo foo = new Foo(1, 2, 3);
			out.writeObject(foo);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
