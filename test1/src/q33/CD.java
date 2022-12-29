package q33;

import java.util.Comparator;

public class CD implements Comparator<CD> {

	private String title;
	private Double price;

	public CD() {}

	public CD(String title, Double price) {
		this.title = title;
		this.price = price;
	}

	public int compare(CD cd1, CD cd2) {
		return cd1.title.compareTo(cd2.title);
	}

	public String toString() {
		return title + ":" + price;
	}
}