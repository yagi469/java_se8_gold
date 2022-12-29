package q78;

public class Main {

	public static void main(String[] args) {
		
		// A. 
		Readable<Integer> r = i -> System.out.println("Skipping" + i);
		r.skip(5);
		r.read(3);
		
		// B. 
//		Readable<Integer> r = b -> b * 2;
//		r.skip(5);
//		r.read(3);
		
		// C. 
//		Readable r = (Integer i) -> System.out.println(i);
//		r.skip(3);
//		Readable.read(5);
	}
}
