package q66;

public class Example<T, U> {

	private T t;
	private U u;

	public Example(T t, U u) {
		this.t = t;
		this.u = u;
	}

	// A.
//	public static <T, T> Example<T> doIt(T value) {
//		return new Example<T, T>(value, value);
//	}
	
	// B.
//	public static <T> Example<T> doIt(T value) {
//		return new Example<T, T>(value, value);
//	}
	
	// C.
	public static <T> Example<T, T> doIt(T value) {
		return new Example<T, T>(value, value);
	}
	
	// D.
//	public static <T, T> Example<T, T> doIt(T value) {
//		return new Example<T, T>(value, value);
//	}


	public T getT() {
		return t;
	}

	public U getU() {
		return u;
	}

	@Override
	public String toString() {
		return "Example [t=" + t + ", u=" + u + "]";
	}
}
