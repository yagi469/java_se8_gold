package q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your age: ");
		//line 1

		// A.
//		int age = reader.read();
		
		// B.
//		int age = reader.nextInt();
		
		// C.
//		int age = Integer.parseInt(reader.next());
		
		// D.
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println(age);
	}
}
