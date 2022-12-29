package q23;

import java.util.Comparator;

public class Product implements Comparator<Product> {
//public class Product implements Comparable<Product> {
	
	private int id;
	private String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ":" + name;
	}

	public int compare(Product p1, Product p2) {
		return p1.id - p2.id;
	}
	
//	public int compareTo(Product o) {
//		return this.id - o.id;
//	}
}