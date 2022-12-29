package q60;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
		
			System.out.print(br.readLine());
			br.mark(); 
			System.out.print(br.readLine());
			br.reset(); 
			System.out.print(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
