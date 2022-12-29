package q83;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] words = "Write_Once_Run_Anywhere".split("_");
		Arrays.stream(words)
			.parallel()
			.forEach(StringConcatenator::concatenate); // line n1
		System.out.println(StringConcatenator.result);
	}
}
