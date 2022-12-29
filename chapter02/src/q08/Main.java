package q08;

public class Main {

	public static void main(String[] args) {
		
		Main obj = new Main();
		obj.doIt(new X<A>());
		obj.doIt(new X<B>());
//		obj.doIt(new X<C>());
		obj.doIt(new X<Object>());
//		obj.doIt(new X<String>());
	}
	
	void doIt(X<? super B> obj) {}
}
