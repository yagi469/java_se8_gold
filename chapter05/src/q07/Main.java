package q07;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("in.txt"); 
			 FileWriter out = new FileWriter("out.txt")) {
			// ファイルの読み書き
		} catch (IOException e) {
			// 例外処理
		}
	}
}
