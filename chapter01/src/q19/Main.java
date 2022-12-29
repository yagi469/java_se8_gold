package q19;

import q19.Outer.Inner;

public class Main {

	public static void main(String[] args) {
		
//		Inner inner = new Outer().Inner();
//		inner.doIt();
		
//		Inner inner = new Outer().new Inner();
//		inner.doIt();
		
//		Outer.Inner inner = new Outer().Inner();
//		inner.doIt();
		
		Outer.Inner inner = new Outer().new Inner();
		inner.doIt();
	}
}
