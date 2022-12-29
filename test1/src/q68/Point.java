package q68;

public class Point {

	private int x = 0, y;

	// A. 
//	public Point() {
//		this(0, 0);
//		super();
//	}
	
	// B. 
//	public Point() {
//		super();
//		this(0, 0);
//	}
	
	// C. 
	public Point() {
		this(0, 0);
	}
	
	// D. 
//	public Point() {
//		this();
//	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}