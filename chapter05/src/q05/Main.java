package q05;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			throw new IOException();
		} catch (IOException | Exception e) { // line n1
			e = new Exception("exception"); // line n2
			System.out.println(e.getMessage()); // line n3
		}
	}
}
