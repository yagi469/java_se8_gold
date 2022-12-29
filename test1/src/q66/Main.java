package q66;

import q66.Outer.Inner;

public class Main {

	public static void main(String[] args) {

		// line n1
		// A. 
//		Inner inner = new Outer.Inner();
		
		// B. 
//		Inner inner = new Outer.new Inner();
		
		// C. 
//		Outer.Inner inner = new Outer().Inner();
		
		// D. 
		Outer.Inner inner = new Outer().new Inner();
		
		inner.print();
	}
}
