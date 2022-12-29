package q24;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

//	public int compareTo(Product p) {
//		return this.id - p.id;
//	}

	public int compare(Product p1, Product p2) {
		return p1.id - p2.id;
	}

//	public boolean compareTo(Product p) {
//		return this.id > p.id;
//	}

//	public boolean compare(Product p1, Product p2) {
//		return p1.id > p2.id;
//	}
}
