package q12;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Foo implements Serializable {

	private int x;
	private transient int y;
	private static int z;

	public Foo(int x, int y, int _z) {
		this.x = x;
		this.y = y;
		z = _z;
	}

	@Override
	public String toString() {
		return x + ":" + y + ":" + z;
	}
}